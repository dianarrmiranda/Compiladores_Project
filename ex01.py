from src.advClasses import *
from numpy import *
from math import *
# from xAdvInterpreter import *

def main():
    v1 = State('A')
    v2 = State('B')
    v1.setinitial('true ')
    v2.setaccepting('true ')
    v3 = Transition('a,b',v1,v2)
    v4 = Transition('a,b,c',v1,v1)
    v0 = Automaton('a1',[v1,v2],[v3,v4])
    v5 = View('v1',v0)
    v6 = 2
    v7 = 1
    v8 = array([v6,v7])
    v5.getstate('A').setpos(v8)
    v9 = 5
    v10 = 1
    v11 = array([v9,v10])
    v5.getstate('B').setpos(v11)
    v13 = ViewPort(v5,(10,10),(500,500))
    v12 = Animation([v13])
    def v14(view):
        view.show(view.getstate('A'))
        view.getstate('B').setaccepting('false ')
        view.show(view.getstate('B'))
        view.pause()
        view.show(view.gettransition('A','B'))
        view.pause()
        view.show(view.gettransition('A','A'))
        view.pause()
        view.getstate('B').setaccepting('true ')
        view.show(view.getstate('B'))
        view.pause()
    v12.add(v14)
    v12.play()

if __name__ == "__main__":
    main()
