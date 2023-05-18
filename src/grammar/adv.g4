grammar adv;

program: alphabetDef (importstat| automatonNFADef| automatonDFADef |viewDef | animationDef |playDef)+ EOF // not finished for test only
;
importstat:'import' ID ';';

alphabetDef : 'alphabet' '{' (alphabetElement',')*alphabetElement '}' |
'alphabet' ID '-' ID ;

alphabetElement: SYMBOL'-'SYMBOL
               | SYMBOL
;    

automatonNFADef: 'NFA' ID '<<<' stateDef+ automatonStat+ transitionDef '>>>';   
automatonDFADef: complete='complete'? 'DFA' ID '<<<' stateDef+ automatonStat+ transitionDef '>>>';   

automatonStat: (automatonFor |automatonIf |automatonWhile |propertiesDef);

automatonFor: 'for' ID 'in' expr automatonStat |
     'for' ID 'in' expr '<<<' automatonStat+ '>>>';
automatonWhile:'while' expr 'do' automatonStat|
'while' expr 'do' '<<<'automatonStat+'>>>';
automatonIf:'if' expr 'do' automatonStat|
'if' expr 'do' '<<<'automatonStat+'>>>';
stateDef: 'state' (ID',')*ID ';'; 

propertiesDef: ID propertyElement+ ';';         
propertyElement: '[' propertiesKeys '=' (ID+ |Number) ']' ; // This requires more attention

transitionDef:     'transition' (transitionElement',')*transitionElement ';';
transitionElement: ID '->' (SYMBOL',')*SYMBOL '->' ID ;

viewDef: 'view' ID 'of' ID '<<<' (viewStat)* '>>>'; // order might matter or not . Maybe create viewBodyDef
viewStat: (algebricOP| viewFor| placeDef| transitionRedefine| propertiesDef| gridDef);
viewFor: 'for' ID 'in' expr viewStat |
     'for' ID 'in' expr '<<<' viewStat+ '>>>';

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
gridOptions: gridProperties '=' (ID+ |Number) ;

animationDef: 'animation' ID '<<<' ( viewportDef | viewportOn )+  '>>>';


viewportDef: 'viewport' ID 'for' ID 'at' expr '--' '++' expr ';';
viewportOn: 'on' ID '<<<' viewportStat+ '>>>';
viewportStat: (propertiesDef| viewportFor| viewportInstructions| algebricOP);

viewportWhile:'while' expr 'do' viewportStat|
'while' expr 'do' '<<<'viewportStat+'>>>'; 
viewportIf:'if' expr 'do' viewportStat|
'if' expr 'do' '<<<'viewportStat+'>>>';
viewportFor: 'for' ID 'in' expr viewportStat |
     'for' ID 'in' expr '<<<' viewportStat+ '>>>';

viewportInstructions: 'show' (viewportInstructionsShowElement',')*viewportInstructionsShowElement ';'
                    | 'show' ';'
                    | 'pause' ';'
;
viewportInstructionsShowElement:ID propertyElement* | transition; 

playDef: 'play' ID ';';

decl: type (assign ',')*assign  | type (ID',')*ID  
;

algebricOP: ( expr | decl | assign ) ';' ;

expr:      'not' expr #NotExpr
         | expr 'and' expr #AndExpr
         | expr 'or' expr #OrExpr
         | expr '>' expr #BiggerExpr
         | expr '<' expr #SmallerExpr
         | expr '==' expr #EqualsExpr
         | expr '>=' expr #BiggerOrEqualExpr
         | expr '<=' expr #SmallerOrEqualExpr
         | op=('+'|'-') expr #UnaryExpr
         | expr op=('+'|'-') expr #AddSubExpr
         | expr op=('*'|'/') expr #MultDivExpr
         | '(' ID ')' #ParanthesisIDExpr
         | '(' expr ')' #ParanthesisExpr
         | point #PointExpr 
         | list #ListExpr
         | Number #NumberExpr
         | ID #IDExpr
         | 'read' ('[prompt=' STRING ']')? #ReadExpr
;
assign: ID '=' expr ;


list: '{{' (ID',')*ID '}}' ;

point: pointRect 
     | pointPol 
; 
pointRect: '(' Number ',' Number ')' ;
pointPol:  '(' Number ':' Number ')' ;

type: number='number' | ponto='point' | lista='list' | string='string' | state='state' ;       // meti ponto e lista para não ter conflito com as regras point e list

gridProperties: step='step'|margin='margin'|color='color'|line='line';
propertiesKeys: initial='initial'|accepting='accepting'|align='align'|slope='slope'|highlighted='highlighted';

Number:  ('+'|'-')?[0-9]+('.'[0-9]+)?; 
ID:      [a-zA-Z][a-zA-Z0-9]*;
SYMBOL:  ['][a-zA-Z0-9]+['] ;
STRING: '"' .*? '"' ;

WS:                [ \t]+ -> skip ;
NEWLINE:           '\r'? '\n' -> skip;
SingleLineComment: [/][/].*?NEWLINE -> skip;
BlockComment :     '/*' .*? '*/' -> skip;

ERROR: . ;

