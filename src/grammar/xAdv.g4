grammar xAdv;

program: definition | importDef;

importDef: 'import' ID;
 
definition: automatonStyle |viewportStyle; //AnimationStyle?(ex. speed of transitions)

automatonStyle: 'automaton {'AutomatonProperty ':' Value '}'//todos os autómatos
|ID '{'AutomatonProperty ':' Value '}'; //um autómato em especifico

viewportStyle: 'viewport {'ViewportProperty ':' Value '}'
|ID '{'ViewportProperty ':' Value '}';

AutomatonProperty:'color'| 'size' | 'font-size' | 'linecolor';
ViewportProperty:'background'| 'height' | 'width' | 'title';

Value:ID | INT; //Should color be predetermined? Aswell as min and max size? 

WS: [ \t]+ ->skip;
INT:[1-9][0-9]*;
NEWLINE:'\r'? '\n' -> skip;
ID: [a-zA-Z][a-zA-Z0-9]*;
SingleLineComment: [/][/].*?NEWLINE -> skip;
BlockComment :'/*' .*? '*/' -> skip;
