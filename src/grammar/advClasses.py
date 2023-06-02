from asyncio import wait
from copy import deepcopy
from numpy import array, ndarray ,matrix , cos , sin , pi, sqrt
import numpy as np
import cv2 as cv
import math
from enum import Enum
from threading import Thread

#--------------------------------------------------------

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __add__(self, other):
        return Point(self.x + other.x, self.y + other.y)

    def __sub__(self, other):
        return Point(self.x - other.x, self.y - other.y)

    def __mul__(self, scalar):
        return Point(self.x * scalar, self.y * scalar)

    def __truediv__(self, scalar):
        return Point(self.x / scalar, self.y / scalar)

    def __floordiv__(self, scalar):
        return Point(self.x // scalar, self.y // scalar)

    def __str__(self):
        return '(' + str(self.x) + ',' + str(self.y) + ')'

    def roundToInt(self):
        return (int(round(self.x)), int(round(self.y)))

    def norm(self):
        return math.sqrt(self.x**2 + self.y**2)

#--------------------------------------------------------

class Align(Enum):
    CENTERED = 0
    LEFT = 1
    RIGHT = 2
    ABOVE = 3
    BELOW = 4

#--------------------------------------------------------

class AdvFigure:
    def __init__(self, key):
        self.key = key
        self.referencePoint = Point(0,0)
        self.visible = False
        self.strokeColor = (0,0,0)
        self.strokeThickness = 2

    def draw(self, mat, scaleFrom, scaleTo):
        pass

#--------------------------------------------------------

class AdvStateFigure(AdvFigure):
    def __init__(self, key, origin):
        super().__init__(key)
        self.accepting = False
        self.initial = False
        self.referencePoint = origin
        self.radius = 0.5

    def draw(self, mat, scaleFrom, scaleTo):
        # if not visible do nothing
        if not self.visible:
            return

        print('  Drawing state ' + self.key)

        # determine center and radius in image coordinates
        c = self.referencePoint / scaleFrom * scaleTo
        center = c.roundToInt()
        r = int(round(self.radius / scaleFrom * scaleTo))

        # draw state shape
        cv.circle(mat, center, r, self.strokeColor, self.strokeThickness)
        if self.accepting == True:
            r2 = int(round(0.8 * self.radius / scaleFrom * scaleTo))
            cv.circle(mat, center, r2, self.strokeColor, self.strokeThickness)
        if self.initial == True:
            pass # ...

        # draw label
        sz,_ = cv.getTextSize(self.key, cv.FONT_HERSHEY_SIMPLEX, 0.8, self.strokeThickness)
        c = c + Point(-sz[0]/2, sz[1]/2)
        center = c.roundToInt()
        cv.putText(mat, self.key, center, cv.FONT_HERSHEY_SIMPLEX, 0.8, self.strokeColor,self.strokeThickness)



#--------------------------------------------------------

class AdvTransitionFigure(AdvFigure):
    def __init__(self, key, label):
        super().__init__(key)
        self.label = label
        self.labelReferencePoint = Point(0,0)
        self.labelAlignment = Align.CENTERED
        self.arrowPoints = []

    def draw(self, mat, scaleFrom, scaleTo):
        # if not visible do nothing
        if not self.visible:
            return

        print('  Drawing transition ' + self.key)

        # convert arrow's points to image coordinates
        points = []
        for p in self.arrowPoints:
            p1 = p / scaleFrom * scaleTo
            points.append(p1.roundToInt())

        print(points)
        # draw the arrow, assuming there are at least 2 points
        for i, p in enumerate(points[:-2]):
            cv.line(mat, p, points[i+1], self.strokeColor, self.strokeThickness)
        cv.arrowedLine(mat, points[-2], points[-1], self.strokeColor, self.strokeThickness)
        #draw label
        sz,_ = cv.getTextSize(self.label, cv.FONT_HERSHEY_SIMPLEX, 0.8, self.strokeThickness)
        c = self.labelReferencePoint / scaleFrom * scaleTo
        if self.labelAlignment == Align.CENTERED:
            c = c + Point(-sz[0]/2, sz[1]/2)
        elif self.labelAlignment == Align.LEFT:
            c = c + Point(0, sz[1]/2)
        elif self.labelAlignment == Align.RIGHT:
            c = c + Point(-sz[0], sz[1]/2)
        elif self.labelAlignment == Align.ABOVE:
            c = c + Point(-sz[0]/2, sz[1])
        elif self.labelAlignment == Align.BELOW:
            c = c + Point(-sz[0]/2, sz[1]*2)
        center = c.roundToInt()
        cv.putText(mat, self.label, center, cv.FONT_HERSHEY_SIMPLEX, 0.8, self.strokeColor,self.strokeThickness)


#--------------------------------------------------------

class AdvLoopTransitionFigure(AdvTransitionFigure):
    def __init__(self, key, label, p, align):
        super().__init__(key, label)

        # set arrow points
        p1 = p + Point(-0.2, -0.6)
        self.arrowPoints.append(p1)
        p1 = p1 + Point(-0.2, -0.3)
        self.arrowPoints.append(p1)
        p1 = p1 + Point(0.8, 0.0)
        self.arrowPoints.append(p1)
        p1 = p1 + Point(-0.2, 0.3)
        self.arrowPoints.append(p1)

        # set label reference point and alignment
        p1 = p1 + Point(0.2, -0.2)
        self.labelReferencePoint = p1
        # convert align string to enum value
        if align == 'BELOW':
            self.labelAlignment = Align.BELOW
        elif align == 'ABOVE':
            self.labelAlignment = Align.ABOVE
        elif align == 'CENTERED':
            self.labelAlignment = Align.CENTERED
        elif align == 'LEFT':
            self.labelAlignment = Align.LEFT
        elif align == 'RIGHT':
            self.labelAlignment = Align.RIGHT
        else:
            raise ValueError("Invalid alignment value")
#--------------------------------------------------------

class AdvLineTransitionFigure(AdvTransitionFigure):
    def __init__(self, key, label, p1, p2, align):
        super().__init__(key, label)

        # set arrow points
        p21 = p2 - p1
        d = p21 / p21.norm() * 0.7
        pa = p1 + d
        self.arrowPoints.append(pa)
        pb = p2 -d
        self.arrowPoints.append(pb)

        # set label reference point and alignment
        p = (pa + pb) / 2 + Point(0, -0.2)
        self.labelReferencePoint = p
        # convert align string to enum value
        if align == 'BELOW':
            self.labelAlignment = Align.BELOW
        elif align == 'ABOVE':
            self.labelAlignment = Align.ABOVE
        elif align == 'CENTERED':
            self.labelAlignment = Align.CENTERED
        elif align == 'LEFT':
            self.labelAlignment = Align.LEFT
        elif align == 'RIGHT':
            self.labelAlignment = Align.RIGHT
        else:
            raise ValueError("Invalid alignment value")

#--------------------------------------------------------
class AdvCurveTransitionFigure(AdvTransitionFigure):
    def __init__(self, key, label, p1, p2, p3, align):
        super().__init__(key, label)
    
        # set arrow points
        p31 = p3 - p1
        d = p31 / p31.norm() * 0.7
        pa = p3 + d + Point(-0.2, 0.9)
        self.arrowPoints.append(pa)
        pb = p2 * 2 + Point(-1.5, 0.3) 
        self.arrowPoints.append(pb)
        pc = p1 - d + Point(-0.5, 0.3)
        self.arrowPoints.append(pc)

        # set label reference point and alignment
        p = (pa + pb + pc) / 3 + Point(0, -0.2)
        self.labelReferencePoint = p
        # convert align string to enum value
        if align == 'BELOW':
            self.labelAlignment = Align.BELOW
        elif align == 'ABOVE':
            self.labelAlignment = Align.ABOVE
        elif align == 'CENTERED':
            self.labelAlignment = Align.CENTERED
        elif align == 'LEFT':
            self.labelAlignment = Align.LEFT
        elif align == 'RIGHT':
            self.labelAlignment = Align.RIGHT
        else:
            raise ValueError("Invalid alignment value")
    
#--------------------------------------------------------

class AdvAutomatonView:
    def __init__(self):
        self.name = ""
        self.figures = {}

    def addFigure(self, key, figure):
        self.figures[key] = figure

    def draw(self, mat, scaleFrom, scaleTo):
        for f in self.figures.values():
            f.draw(mat, scaleFrom, scaleTo)
        

#--------------------------------------------------------

class Animation:

    def __init__(self,viewPorts):
        
        # create a copy of a viewport
        self.viewPorts = deepcopy(viewPorts)

        self.animfunc = []

        self.threads = []

    def play(self):
        for i in range(len(self.animfunc)):
            t = Thread( target=self.animfunc[i] , args=(self.viewPorts[i],) )
            self.threads.append(t)
            t.start()

        for i in self.threads:
            i.join()

    def add(self,func):
        self.animfunc.append(func)
        
    def __str__(self) -> str:
        return str(self.__dict__)
    
    def __repr__(self) -> str:
        return str(self)

class Grid:

    def __init__(self,widthheigth,step=0.5,margin=0.25,color='gray',line='solid'):
        self.width = widthheigth[0]
        self.heigth = widthheigth[1]
        self.step = step
        self.margin = margin
        self.color = color
        self.line = line

    def setstep(self,val):
        self.step = val

    def setmargin(self,val):
        self.margin = val

    def setcolor(self,val):
        self.color = val

    def setline(self,val):
        self.line = val

    def draw():
        pass
        

class State:

    def __init__(self, label , accepting = "False" , initial = "False"):
        
        self.label = label

        self.accepting = accepting

        self.initial = initial

        self.pos = array([0,0])

    def setaccepting(self,val) -> None:
        self.accepting = val

    def setinitial(self,val) -> None:
        self.initial = val

    def setpos(self,val) -> None:
        self.pos = val

    def getpos(self) -> ndarray:
        return self.pos
    
    def draw(self, img):
        pass

    def __str__(self) -> str:
        return str(self.__dict__)
    
    def __repr__(self) -> str:
        return str(self)

class Transition:

    def __init__(self,label,stateStart,stateEnd):

        # Label on transition 
        self.label = label

        # Starting state
        self.stateStart = stateStart

        # End State
        self.stateEnd = stateEnd

        self.alignlabel = 'CENTERED'

        self.points = []

        self.slope= []

        self.lablepos = array([0,0])

    def setalign(self,val) -> None:
        self.alignlabel = val.upper().strip()

    def setpos(self,val) -> None:
        self.lablepos = val

    def addpoint(self,point,slope=-1) -> None:
        print("point: " + str(point))
        self.points.insert(-1,point)
        self.slope.append(slope)

    def draw(self, img):
        pass

    def __str__(self) -> str:
        return str(self.__dict__)
    
    def __repr__(self) -> str:
        return str(self)

class ViewPort:

    def __init__(self,view,cornerBottom,cornerTop):
        
        self.view = view

        self.cornerBottom = cornerBottom

        self.cornerTop = cornerTop

        self.states : State = []

        self.av = AdvAutomatonView()
        for state in view.automaton.states:
            self.f = AdvStateFigure(state.label, Point(state.pos[0], state.pos[1]))
            self.av.addFigure(state.label, self.f)

        for transition in view.automaton.transitions:
            stateStart = transition.stateStart.label
            stateEnd = transition.stateEnd.label
            trans = '<'+stateStart+','+stateEnd+'>'
            point1 = transition.stateStart.pos
            point2 = transition.stateEnd.pos
            point3 = transition.points
            labelAlign = transition.alignlabel
            print("point3: " + str(point3))
            if stateStart == stateEnd:
                self.f = AdvLoopTransitionFigure(trans, transition.label, Point(point1[0], point2[1]),labelAlign)
                self.av.addFigure(trans, self.f)
            elif (stateStart > stateEnd):
                self.f = AdvCurveTransitionFigure(trans, transition.label, Point(point3[0][0], point3[0][1]), Point(point3[1][0], point3[1][1]), Point(point3[2][0], point3[2][1]),labelAlign)
                self.av.addFigure(trans, self.f)
            elif (stateStart < stateEnd):
                self.f = AdvLineTransitionFigure(trans, transition.label, Point(point1[0], point1[1]), Point(point2[0], point2[1]), labelAlign)
                self.av.addFigure(trans, self.f)

        self.window = np.zeros((510, 510, 3), dtype="uint8")
        self.window.fill(100)

        self.vp = np.zeros((500, 500, 3), dtype="uint8")
        self.vp.fill(255)

    def getstate(self,str: str) -> State:
        return self.view.getstate(str)
    
    def gettransition(self,str1: str,str2: str) -> Transition:
        return self.view.gettransition(str1,str2)

    def show(self, *args):
        for arg in args:
            if arg.__class__ == State:
                self.states.append(arg)
                self.av.figures[arg.label].visible = True
            
            if arg.__class__ == Transition:
                self.av.figures['<'+arg.stateStart.label+','+arg.stateEnd.label+'>'].visible = True
            
        for state in self.states:
            if state.accepting.strip() == 'true':
                self.av.figures[state.label].accepting = True;

        self.av.draw(self.vp, 1.0, 50)
        np.copyto(self.window[10:,10:,:], self.vp)
        cv.imshow('Animation a1', self.window)

    def pause(self):
        print("------------------------------------------")
        cv.waitKey(0)
        pass

    def __str__(self) -> str:
        return str(self.__dict__)
    
    def __repr__(self) -> str:
        return str(self)

class Grid:

    def __init__(self,widthheigth,step=0.5,margin=0.25,color='gray',line='solid'):
        self.width = widthheigth[0]
        self.heigth = widthheigth[1]
        self.step = step
        self.margin = margin
        self.color = color
        self.line = line

    def setstep(self,val):
        self.step = val

    def setmargin(self,val):
        self.margin = val

    def setcolor(self,val):
        self.color = val

    def setline(self,val):
        self.line = val

class View:

    def __init__(self,name,automaton):

        self.name = name

        # automaton should be a copy of the automaton
        self.automaton = deepcopy(automaton)  

        self.grid = None

    def getstate(self,str: str) -> State:
        return self.automaton.getstate(str)
    
    def gettransition(self,str1: str,str2: str) -> Transition:
        return self.automaton.gettransition(str1,str2)    

    def setgrid(self,grid):
        self.grid = grid
    
    def draw(self, img):
        self.automaton.draw(img)

    def __str__(self) -> str:
        return str(self.__dict__)
    
    def __repr__(self) -> str:
        return str(self)
    

class Automaton:

    def __init__(self,name,states,transitions):

        self.name=name

        self.states=states

        self.transitions=transitions
    
    def getstate(self,str: str) -> State:
        i= list(map(lambda x : x.label,self.states)).index(str) 
        return self.states[i]
    
    def gettransition(self,str1: str,str2: str) -> Transition:
        i= list(map(lambda x : (x.stateStart.label,x.stateEnd.label),self.transitions)).index((str1,str2)) 
        return self.transitions[i]

    def draw(self, img):
        for state in self.states:
            state.draw(img)

        for transition in self.transitions:
            transition.draw(img)

    def __str__(self) -> str:
        return str(self.__dict__)
    
    def __repr__(self) -> str:
        return str(self)

def HermiteSpline(points: list,tangents: list,scales:list=[],res=25) -> list:
    """
    Given a set of points and tangents returns a set of points describing a path that passes
    through all the points with the given tangent.

     points: A set of points where the spline must pass.
     tangents: Defines a tangent in degrees to the spline at the point of correspoding index.
     scales: Defines the 'how much' the tangent influences the spline.
     res: the number of points generated between 2 points of param points.
     return: A list of points 

     Size of points and tangent must be the same.
    """
    assert len(points) == len(tangents)

    # If scale not defined default to 200 
    # if len(scales) == 0:
    #     scales = [200]*len(points)


    # If scale not defined default to average distance between the self and neighboor points
    # This makes it so the curvature is proportional to distance between points which seems natural
    def absP(P):
        return sqrt( P[0]**2 + P[1] **2 )
    if len(scales) == 0:
        a = [ absP( points[x]-points[x+1] ) for x in range(0,len(points)-1) ]
        scales = [a[0]]
        for i in range(1,len(points)-1):
            scales.append( (a[i]+a[i-1])/2 )
        scales.append(a[len(points)-2])

    # Define Hermite matrix
    H = matrix([[ 1, 0, 0, 0],
                [ 0, 1, 0, 0],
                [-3,-2, 3,-1],
                [ 2, 1,-2, 1]])

    # Function that returns vector with powers of t
    T = lambda t: array( [1,t,t**2,t**3] )

    # function that does all the main calculation 
    # basicly only two points and two tangents at a specific t in [0,1]
    def hermiteSpline2Points(P1,P2,v1,v2,t):
        P = array([P1,v1,P2,v2])
        r = array(T(t)*H*P)
        return array([int(r[0,0]),int(r[0,1])])
    
    # Convert tagents to velocity
    # invert y because higher values are down
    velocities = [ array([ scales[i]*cos( tangents[i] * pi / 180 ) , -scales[i]*sin( tangents[i] * pi / 180 )  ]) 
                  for i in range(len(tangents))]
    output = []
    for i in range(1,len(points)):
        P1 = points[i-1]
        P2 = points[i]
        v1 = velocities[i-1]
        v2 = velocities[i]

        output.append(P1)
        for n in range(1,res):
            output.append( hermiteSpline2Points(P1,P2,v1,v2,n/res) )
        output.append(P2)

    return output

def hermitetest():
    img = np.zeros((500, 500, 3), dtype=np.uint8)

    points = [ array([50,50]) , array([250,150]) , array([400,50]) ,array([400,400])  ]
    tangents = [ -45,90,0,-120 ]

    spline = HermiteSpline(points,tangents)
    for i in range(1,len(spline)):
        cv.line(img,spline[i-1],spline[i],(255,255,255),2)

    for i in points:
        cv.circle(img,i,5,(255,0,0),5)

    cv.imshow("test",img)
    cv.waitKey(0)

if __name__ == "__main__":
    hermitetest()
