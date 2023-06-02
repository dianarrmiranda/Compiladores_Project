for v79 in v78:
    view.getstate('i').setaccepting('false ')
    view.show(view.getstate('i'))
for v81 in v80:
    view.getstate('i').setaccepting('true ')
    view.show(view.getstate('i'))
from advClasses import *
from numpy import *
from math import *
# from xAdvInterpreter import *

def main():
    v1 = State('A')
    v2 = State('B')
    v3 = State('C')
    v4 = State('D')
    v5 = State('E')
    v1.setinitial('true ')
    v6 = [v1,v2,v4]
    for v7 in v6:
        v7.setaccepting('true ')
    v8 = Transition('a',v1,v2)
    v9 = Transition('b',v2,v3)
    v10 = Transition('c',v3,v4)
    v11 = Transition('a,b',v3,v5)
    v12 = Transition('a,b,c',v5,v5)
    v13 = Transition('a',v2,v2)
    v14 = Transition('c',v2,v1)
    v15 = Transition('c',v1,v1)
    v16 = Transition('c',v4,v4)
    v17 = Transition('a',v4,v2)
    v18 = Transition('b',v4,v5)
    v19 = Transition('b',v1,v5)
    v0 = Automaton('a3',[v1,v2,v3,v4,v5],[v8,v9,v10,v11,v12,v13,v14,v15,v16,v17,v18,v19])
    v20 = View('v3',v0)
    v21 = Grid(widthheigth)
    v21.setstep(0.5)
    v21.setmargin(0.25)
    v21.setcolor('gray')
    v21.setline('solid')
    v22 = 2
    v23 = 1
    v24 = array([v22,v23])
    v20.getstate('A').setpos(v24)
    v25 = 5
    v26 = 1
    v27 = array([v25,v26])
    v20.getstate('B').setpos(v27)
    v28 = 7
    v29 = 1
    v30 = array([v28,v29])
    v20.getstate('C').setpos(v30)
    v31 = 10
    v32 = 1
    v33 = array([v31,v32])
    v20.getstate('D').setpos(v33)
    v34 = 4.5
    v35 = 4
    v36 = array([v34,v35])
    v20.getstate('E').setpos(v36)
    v37 = v20.getstate('B').getpos()
    v38 = 200
    v39 = 0.7
    v40 = array([v39*cos(radians(v38)),v39*sin(radians(v38))])
    v41 = v37 + v40
    v42 = v20.getstate('A').getpos()
    v43 = 20
    v44 = 0.7
    v45 = array([v44*cos(radians(v43)),v44*sin(radians(v43))])
    v46 = v42 + v45
    v47 = v20.getstate('A').getpos()
    v48 = v20.getstate('B').getpos()
    v49 = v47 + v48
    v50 = 2
    v51 = v49 / v50
    v52 = 0
    v53 = 0.5
    v54 = array([v52,v53])
    v55 = v51 + v54
    v20.gettransition('B','A').addpoint(v41)
    v20.gettransition('B','A').addpoint(v55)
    v20.gettransition('B','A').addpoint(v46)
    v20.gettransition('B','A').setalign('above ')
    v20.gettransition('B','A').setpos(v55)
    v56 = v20.getstate('D').getpos()
    v57 = 200
    v58 = 0.7
    v59 = array([v58*cos(radians(v57)),v58*sin(radians(v57))])
    v60 = v56 + v59
    v61 = v20.getstate('B').getpos()
    v62 = 20
    v63 = 0.7
    v64 = array([v63*cos(radians(v62)),v63*sin(radians(v62))])
    v65 = v61 + v64
    v66 = v20.getstate('D').getpos()
    v67 = v20.getstate('B').getpos()
    v68 = v66 + v67
    v69 = 2
    v70 = v68 / v69
    v71 = 0
    v72 = 1.0
    v73 = array([v71,v72])
    v74 = v70 + v73
    v20.gettransition('D','B').addpoint(v60)
    v20.gettransition('D','B').addpoint(v74)
    v20.gettransition('D','B').addpoint(v65)
    v20.gettransition('D','B').setalign('above ')
    v20.gettransition('D','B').setpos(v74)
    v20.gettransition('A','E').setalign('below left ')
    v20.gettransition('D','E').setalign('below right ')
    v20.gettransition('C','E').setalign('right ')
    v20.gettransition('E','E').setalign('left ')
    v76 = ViewPort(v20,(10,10),(500,300))
    v75 = Animation([v76])
    def v77(view):
        view.show(view.getstate('g3'))
        view.pause()
        v78 = [v1,v2,v4]
        for v79 in v78:
            view.getstate('i').setaccepting('false ')
            view.show(view.getstate('i'))
        view.show(view.getstate('C'))
        view.show(view.gettransition('A','B'))
        view.show(view.gettransition('B','C'))
        view.show(view.gettransition('C','D'))
        view.pause()
        view.show(view.getstate('E'))
        view.show(view.gettransition('C','E'))
        view.show(view.gettransition('E','E'))
        view.pause()
        view.show(view.gettransition('B','B'))
        view.show(view.gettransition('B','A'))
        view.pause()
        view.show(view.gettransition('A','A'))
        view.show(view.gettransition('A','E'))
        view.show(view.gettransition('D','D'))
        view.show(view.gettransition('D','E'))
        view.show(view.gettransition('D','B'))
        view.pause()
        v80 = [v1,v2,v4]
        for v81 in v80:
            view.getstate('i').setaccepting('true ')
            view.show(view.getstate('i'))
        view.pause()
    v75.add(v77)
    v75.play()

if __name__ == "__main__":
    main()
