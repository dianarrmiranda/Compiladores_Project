from advClasses import *
from numpy import *
from math import *
# from xAdvInterpreter import *

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
    v15 = 200
    v16 = 0.6
    v17 = array([v16*cos(radians(v15)),v16*sin(radians(v15))])
    v18 = v14 + v17
    v19 = v7.getstate('A').getpos()
    v20 = -20
    v21 = 0.6
    v22 = array([v21*cos(radians(v20)),v21*sin(radians(v20))])
    v23 = v19 + v22
    v24 = v18 + v23
    v25 = 2
    v26 = v24 / v25
    v27 = 0
    v28 = 0.2
    v29 = array([v27,v28])
    v30 = v26 + v29
    v7.gettransition('B','A').addpoint(v18)
    v7.gettransition('B','A').addpoint(v30)
    v7.gettransition('B','A').addpoint(v23)
    v7.gettransition('B','A').setalign('below ')
    v7.gettransition('B','A').setpos(v30)
    v32 = ViewPort(v7,(10,10),(500,300))
    v31 = Animation([v32])
    def v33(view):
        view.show(view.getstate('A'))
        view.pause()
        view.show(view.gettransition('A','A'))
        view.pause()
        view.show(view.getstate('B'))
        view.show(view.gettransition('A','B'))
        view.pause()
        view.show(view.gettransition('B','B'))
        view.pause()
        view.show(view.gettransition('B','A'))
        view.pause()
    v31.add(v33)
    v31.play()

if __name__ == "__main__":
    main()
