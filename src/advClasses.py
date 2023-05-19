from copy import deepcopy

class Animation:

    def __init__(self,viewPorts):
        
        self.viewPorts = viewPorts

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

class View:

    def __init__(self,name,automaton):

        self.name = name

        # automaton should be a copy of the automaton
        self.automaton = deepcopy(automaton)  

    def __str__(self) -> str:
        return str(self.__dict__)
    
    def __repr__(self) -> str:
        return str(self)

class Automaton:

    def __init__(self,name,states,transitions):

        self.name=name

        self.states=states

        self.transitions=transitions
    
    def __str__(self) -> str:
        return str(self.__dict__)
    
    def __repr__(self) -> str:
        return str(self)


class State:

    def __init__(self, label , accepting = "False" , initial = "False"):
        
        self.label = label

        self.accepting = accepting

        self.initial = initial

    def setaccepting(self,val):
        self.accepting = val

    def setinitial(self,val):
        self.initial = val

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

    def setalignlabel(self,val):
        self.alignlabel = val

    def __str__(self) -> str:
        return str(self.__dict__)
    
    def __repr__(self) -> str:
        return str(self)
    

v1 = State('A')
v2 = State('B')
v1.setinitial('true')
v2.setaccepting('true')
v3 = Transition('a,b',v1,v2)
v4 = Transition('a,b,c',v1,v1)
v0 = Automaton('a1',[v1,v2],[v3,v4])
