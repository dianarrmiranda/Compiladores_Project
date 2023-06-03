from advClasses import *
import Interpreter
from numpy import *
from math import *
styles=False
string=""
def main():
    v1 = State('A')
    v2 = State('B')
    v1.setinitial('true ')
    v2.setaccepting('true ')
    v3 = Transition('a,b',v1,v2)
    v4 = Transition('c',v1,v1)
    v5 = Transition('c',v2,v1)
    v6 = Transition('a,b',v2,v2)
    v0 = Automaton('a2',[v1,v2],[v3,v4,v5,v6])
    v7 = View('v2',v0)
    v8 = 2
    v9 = 1
    v10 = array([v8,v9])
    v7.getstate('A').setpos(v10)
    v11 = 5
    v12 = 1
    v13 = array([v11,v12])
    v7.getstate('B').setpos(v13)
    v14 = v7.getstate('B').getpos()
    v15 = v14
    v16 = 200
    v17 = 0.6
    v18 = array([v17*cos(radians(v16)),v17*sin(radians(v16))])
    v19 = v18
    v20 = v15 + v19
    v15 = v20
    v21 = v7.getstate('A').getpos()
    v22 = -20
    v23 = 0.6
    v24 = array([v23*cos(radians(v22)),v23*sin(radians(v22))])
    v25 = v21 + v24
    v26 = v25
    v27 = v15 + v26
    v28 = 2
    v29 = v27 / v28
    v30 = 0
    v31 = 0.2
    v32 = array([v30,v31])
    v33 = v29 + v32
    v34 = v33
    v7.gettransition('B','A').addpoint(v15)
    v7.gettransition('B','A').addpoint(v34)
    v7.gettransition('B','A').addpoint(v26)
    v7.gettransition('B','A').setalign('below ')
    v7.gettransition('B','A').setpos(v34)
    v36 = ViewPort(v7,(10,10),(500,300),styles,string)
    v35 = Animation([v36])
    def v37(view):
        view.show(view.get('A'))
        view.pause()
        view.show(view.gettransition('A','A'))
        view.pause()
        view.show(view.get('B'))
        view.show(view.gettransition('A','B'))
        view.pause()
        view.show(view.gettransition('B','B'))
        view.pause()
        view.show(view.gettransition('B','A'))
        view.pause()
    v35.add(v37)
    v35.play()

if __name__ == "__main__":
    main()
    