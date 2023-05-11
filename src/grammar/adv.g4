grammar adv;

program: alphabetDef automatonDef viewDef animationDef playDef EOF // not finished for test only
;

stat: ( algebricOP | forIn | viewportInstructions | propertiesDef ) ; //this is causing me headache
/*
     Problem: forIn can repeat things but depending if im in animationDef or any def 
     I want to block certain operation like viewportInstructions. This could be done in semantic analysis
     where we would need to test which statements are valid to run.

     Currently this is kinda bad because stat is kinda mixed because for example transitionRedefine
     should be a statement but in the examples its never on a for loop so i can get way with it not being a
     statement which also blocks the operation from being used in incorrect contexts 
     On the other hand viewportInstructions appears inside a for loop so i need to put in statement.

     So either we change transitionRedefine to being a statement and more semantics
      or create a unique stat for animationDef automatonDef viewDef to block unwanted operation in those contexts
 */


alphabetDef : 'alphabet' '{' (alphabetElement',')*alphabetElement '}';
alphabetElement: SYMBOL'-'SYMBOL
               | SYMBOL
;

automatonDef: AutomatonTypes ID '<<<' /*stateDef+*/ stat* transitionDef '>>>';   // order might matter or not . Maybe create automatonBodyDef

//stateDef: 'state' (ID',')*ID ';'; //idk why this doesnt work

propertiesDef: ID propertyElement+ ';';         
propertyElement: '[' PropertiesKeys '=' (ID+ |Number) ']' ; // This requires more attention

transitionDef:     'transition' (transitionElement',')*transitionElement ';';
transitionElement: ID '->' (SYMBOL',')*SYMBOL '->' ID ;


viewDef: 'view' ID 'of' ID '<<<' (placeDef|stat|transitionRedefine|gridDef)* '>>>'; // order might matter or not . Maybe create viewBodyDef

transitionRedefine: transition 'as' transitionPoint '--' (transitionPoint '--')* transitionPoint';'
                  | transitionLabelAlter ';';
transitionPoint: expr propertyElement*;

transitionLabelAlter: transition '#label' propertyElement*;

transition: '<'ID','ID'>' ;

placeDef: 'place' (placeElement',')*placeElement ';';
placeElement: ID 'at' expr
            | transitionLabelAlter 'at' expr 
;

gridDef: 'grid' ID expr '[' (gridOptions',')*gridOptions ']' ';';
gridOptions: GridProperties '=' (ID+ |Number) ;

animationDef: 'animation' ID '<<<' ( viewportDef | viewportOn )* '>>>';

viewportDef: 'viewport' ID 'for' ID 'at' expr '--' '++' expr ';';

viewportOn: 'on' ID '<<<' stat* '>>>';

viewportInstructions: 'show' (viewportInstructionsShowElement',')*viewportInstructionsShowElement ';'
                    | 'show' ';'
                    | 'pause' ';'
;
viewportInstructionsShowElement: ID propertyElement* | transition ;

playDef: 'play' ID ';';

decl: Type (ID',')*ID  
     |Type (assign ',')*assign  
;

expr:    op=('+'|'-') expr
         | expr op=('*'|'/') expr
         | expr op=('+'|'-') expr
         | '(' ID ')' 
         | '(' expr ')' 
         | point | list | Number
         | ID
         | 'read' ('[prompt=' STRING ']')?
;

assign: ID '=' expr ;

algebricOP: ( expr | decl | assign ) ';' ;

list: '{{' (ID',')*ID '}}' ;

point: pointRect 
     | pointPol 
; 
pointRect: '(' Number ',' Number ')' ;
pointPol:  '(' Number ':' Number ')' ;

forIn: 'for' ID 'in' expr stat
     | 'for' ID 'in' expr '<<<' stat+ '>>>'
;

Type: 'number' | 'point' | 'list' | 'string' | 'state' ;

GridProperties: 'step'|'margin'|'color'|'line';
PropertiesKeys: 'initial'|'accepting'|'align'|'slope'|'highlighted';
AutomatonTypes:      ('NFA'|'DFA'|('complete'WS+'DFA')) ;

Number:  ('+'|'-')?[0-9]+('.'[0-9]+)?; // maybe incorrect
ID:      [a-zA-Z0-9]+;
SYMBOL:  ['][a-zA-Z0-9]+['] ;
STRING: '"' .*? '"' ;

WS:                [ \t]+ -> skip ;
NEWLINE:           '\r'? '\n' -> skip;
SingleLineComment: [/][/].*?NEWLINE -> skip;
BlockComment :     '/*' .*? '*/' -> skip;

ERROR: . ;

