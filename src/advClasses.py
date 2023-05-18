class Animation:

    def __init__(self,viewPorts):
        
        self.viewPorts = viewPorts

    def play(self):
        pass

class ViewPort:

    def __init__(self,view,cornerBottom,cornerTop):
        
        self.view = view

        self.cornerBottom = cornerBottom

        self.cornerTop = cornerTop

class View:

    def __init__(self,automaton,placementStates,placementTransitions):

        # map of { state:(location) }
        self.placementStates = placementStates

        # map of { transition:[points] }
        self.placementTransitions = placementTransitions

        self.automaton = automaton  

class Automaton:

    def __init__(self,name,states,transitions):

        self.name=name

        self.states=states

        self.transtions=transitions


class State:

    def __init__(self, label , accepting = "False" , initial = "False"):
        
        self.label = label

        self.accepting = accepting

        self.initial = initial


class Transition:

    def __init__(self,label,stateStart,stateEnd):

        # Label on transition 
        self.label = label

        # Starting state
        self.stateStart = stateStart

        # End State
        self.stateEnd = stateEnd
