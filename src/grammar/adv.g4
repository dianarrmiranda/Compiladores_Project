grammar adv;

program: alphabetDef (importstat| automatonDef |viewDef | animationDef |playDef)+ EOF // not finished for test only
;
importstat:'import' ID ';';

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


alphabetDef : 'alphabet' '{' (alphabetElement',')*alphabetElement '}' |
'alphabet' ID '-' ID ;

alphabetElement: SYMBOL'-'SYMBOL
               | SYMBOL
;    

automatonDef: AutomatonTypes ID '<<<' stateDef+ automatonStat* transitionDef '>>>';   // order might matter or not . Maybe create automatonBodyDef
automatonStat: (automatonFor |propertiesDef);
automatonFor: 'for' ID 'in' expr automatonStat |
     'for' ID 'in' expr '<<<' automatonStat '>>>';

stateDef: 'state' (ID',')*ID ';'; 

propertiesDef: ID propertyElement+ ';';         
propertyElement: '[' PropertiesKeys '=' (ID+ |Number) ']' ; // This requires more attention

transitionDef:     'transition' (transitionElement',')*transitionElement ';';
transitionElement: ID '->' (SYMBOL',')*SYMBOL '->' ID ;

viewDef: 'view' ID 'of' ID '<<<' (viewStat)* '>>>'; // order might matter or not . Maybe create viewBodyDef
viewStat: (algebricOP| viewFor| placeDef| transitionRedefine| propertiesDef| gridDef);
viewFor: 'for' ID 'in' expr viewStat |
     'for' ID 'in' expr '<<<' viewStat '>>>';

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

animationDef: 'animation' ID '<<<' ( viewportDef | viewportOn )+  '>>>';


viewportDef: 'viewport' ID 'for' ID 'at' expr '--' '++' expr ';';
viewportOn: 'on' ID '<<<' viewportStat* '>>>';
viewportStat: (propertiesDef| viewportFor| viewportInstructions| algebricOP);
viewportFor: 'for' ID 'in' expr viewportStat |
     'for' ID 'in' expr '<<<' viewportStat '>>>';

viewportInstructions: 'show' (viewportInstructionsShowElement',')*viewportInstructionsShowElement ';'
                    | 'show' ';'
                    | 'pause' ';'
;
viewportInstructionsShowElement:ID propertyElement* | transition; 

playDef: 'play' ID ';';

decl: type (assign ',')*assign  | type (ID',')*ID  
;

algebricOP: ( expr | decl | assign ) ';' ;

whileStat:'while' booleanExpr 'do' expr; 

ifStat:'if' booleanExpr 'do' expr;

booleanExpr:expr? BoolOperator expr; //Review expr type

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


list: '{{' (ID',')*ID '}}' ;

point: pointRect 
     | pointPol 
; 
pointRect: '(' Number ',' Number ')' ;
pointPol:  '(' Number ':' Number ')' ;

type: 'number' | 'point' | 'list' | 'string' | 'state' ;

BoolOperator: 'not'| 'and'| 'or'; //  >,<,== would make more sense? Look at TaskGuide


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

