grammar xAdv;

program: definitions+ EOF;

definitions:(importDef | concreteDefinition);

importDef: 'import' Value;
 
concreteDefinition: 'define' (automatonStyle |viewportStyle); //AnimationStyle?(ex. speed of transitions)

automatonStyle: 'automaton''{'(AutomatonProperty ':' Value)+ '}'//todos os autómatos
|Value '{'(AutomatonProperty ':' Value)+ '}'; //um autómato em especifico

viewportStyle: 'viewport''{'(ViewportProperty ':' Value)+ '}'
|Value '{'(ViewportProperty ':' Value)+ '}';

AutomatonProperty:'color'| 'size' | 'font-size' | 'linecolor';
ViewportProperty:'background'| 'height' | 'width' | 'title';



WS: [ \t]+ ->skip;
Ignore:';' ->skip;
Value: '"'ID (WS ID)+'"'|ID| INT;
INT:[1-9][0-9]*;
ID: [a-zA-Z][a-zA-Z0-9]*;
NEWLINE:'\r'? '\n' -> skip;
SingleLineComment: [/][/].*?NEWLINE -> skip;
BlockComment :'/*' .*? '*/' -> skip;
