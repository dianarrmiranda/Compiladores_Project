from advClasses import *
import Interpreter
from numpy import *
from math import *
styles=False
string=""
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
    v16 = Transition('c',v4,v1)
    v17 = Transition('a',v4,v2)
    v18 = Transition('b',v4,v5)
    v19 = Transition('b',v1,v5)
    v0 = Automaton('a4',[v1,v2,v3,v4,v5],[v8,v9,v10,v11,v12,v13,v14,v15,v16,v17,v18,v19])
    v20 = View('v4',v0)
    v21 = 2
    v22 = 1
    v23 = array([v21,v22])
    v20.getstate('A').setpos(v23)
    v24 = 5
    v25 = 1
    v26 = array([v24,v25])
    v20.getstate('B').setpos(v26)
    v27 = 7
    v28 = 1
    v29 = array([v27,v28])
    v20.getstate('C').setpos(v29)
    v30 = 10
    v31 = 1
    v32 = array([v30,v31])
    v20.getstate('D').setpos(v32)
    v33 = 5
    v34 = 4
    v35 = array([v33,v34])
    v20.getstate('E').setpos(v35)
    v36 = v20.getstate('B').getpos()
    v37 = 235
    v38 = 0.7
    v39 = array([v38*cos(radians(v37)),v38*sin(radians(v37))])
    v40 = v36 + v39
    v41 = v40
    v42 = v20.getstate('A').getpos()
    v43 = 45
    v44 = 0.7
    v45 = array([v44*cos(radians(v43)),v44*sin(radians(v43))])
    v46 = v42 + v45
    v47 = v46
    v48 = v20.getstate('A').getpos()
    v49 = v20.getstate('B').getpos()
    v50 = v48 + v49
    v51 = 2
    v52 = v50 / v51
    v53 = 0
    v54 = -0.5
    v55 = array([v53,v54])
    v56 = v52 + v55
    v57 = v56
    v20.gettransition('B','A').addpoint(v41,slope=235)
    v20.gettransition('B','A').addpoint(v57,slope=0)
    v20.gettransition('B','A').addpoint(v47,slope=45)
    v20.gettransition('B','A').setalign('below ')
    v20.gettransition('B','A').setpos(v57)
    v58 = v20.getstate('D').getpos()
    v59 = 150
    v60 = 0.7
    v61 = array([v60*cos(radians(v59)),v60*sin(radians(v59))])
    v62 = v58 + v61
    v41 = v62
    v63 = v20.getstate('B').getpos()
    v64 = 30
    v65 = 0.7
    v66 = array([v65*cos(radians(v64)),v65*sin(radians(v64))])
    v67 = v63 + v66
    v47 = v67
    v68 = v20.getstate('D').getpos()
    v69 = v20.getstate('B').getpos()
    v70 = v68 + v69
    v71 = 2
    v72 = v70 / v71
    v73 = 0
    v74 = 1.0
    v75 = array([v73,v74])
    v76 = v72 + v75
    v57 = v76
    v20.gettransition('D','B').addpoint(v41,slope=150)
    v20.gettransition('D','B').addpoint(v57,slope=0)
    v20.gettransition('D','B').addpoint(v47,slope=30)
    v20.gettransition('D','B').setalign('above ')
    v20.gettransition('D','B').setpos(v57)
    v77 = v20.getstate('D').getpos()
    v78 = 120
    v79 = 0.7
    v80 = array([v79*cos(radians(v78)),v79*sin(radians(v78))])
    v81 = v77 + v80
    v41 = v81
    v82 = v20.getstate('A').getpos()
    v83 = 60
    v84 = 0.7
    v85 = array([v84*cos(radians(v83)),v84*sin(radians(v83))])
    v86 = v82 + v85
    v47 = v86
    v87 = v20.getstate('D').getpos()
    v88 = v20.getstate('A').getpos()
    v89 = v87 + v88
    v90 = 2
    v91 = v89 / v90
    v92 = 0
    v93 = 1.5
    v94 = array([v92,v93])
    v95 = v91 + v94
    v57 = v95
    v20.gettransition('D','A').addpoint(v41,slope=120)
    v20.gettransition('D','A').addpoint(v57,slope=0)
    v20.gettransition('D','A').addpoint(v47,slope=60)
    v20.gettransition('D','A').setalign('above ')
    v20.gettransition('D','A').setpos(v57)
    v20.gettransition('A','E').setalign('below left ')
    v20.gettransition('D','E').setalign('below right ')
    v20.gettransition('C','E').setalign('right ')
    v20.gettransition('E','E').setalign('left ')
    v97 = ViewPort(v20,(10,10),(500,300),styles,string)
    v96 = Animation([v97])
    def v98(view):
        view.show()
        v99 = input("Insira uma palavra: ")
        v100 = v99
        v101 = view.get('A')
        view.get(v101).sethighlighted('true ')
        view.show(view.get(v101))
        view.pause()
        for v102 in v100:
            if not view.update(v102):
                break
            view.pause()
    v96.add(v98)
    v96.play()

if __name__ == "__main__":
    main()
    