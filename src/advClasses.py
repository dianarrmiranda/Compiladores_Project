from copy import deepcopy
from numpy import array, ndarray

class Animation:

    def __init__(self,viewPorts):
        
        # create a copy of a viewport
        self.viewPorts = deepcopy(viewPorts)

    def play(self):
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
        return array([self.px,self.py])

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

        self.alignlabel = 'middle'

        self.points = [self.stateStart.pos,self.stateEnd.pos]

        self.slope= []

        self.lablepos = array([0,0])

    def setalign(self,val) -> None:
        self.alignlabel = val

    def setpos(self,val) -> None:
        self.lablepos = val

    def addpoint(self,point,slope=-1) -> None:
        self.points.insert(-1,point)
        self.slope.append(slope)

    def __str__(self) -> str:
        return str(self.__dict__)
    
    def __repr__(self) -> str:
        return str(self)
    

class View:

    def __init__(self,name,automaton):

        self.name = name

        # automaton should be a copy of the automaton
        self.automaton = deepcopy(automaton)  

        self.grid = None

    def getstate(self,str: str) -> State:
        return self.automaton.getstate(str)
    
    def gettransition(self,str1: str,str2: str) -> Transition:
        return self.automaton.gettransition(str)    

    def setgrid(self,grid):
        self.grid = grid

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

    def __str__(self) -> str:
        return str(self.__dict__)
    
    def __repr__(self) -> str:
        return str(self)

