grammar benq;

start
   : block '^'
   ;

block
   : vars* procedure* statement
   ;

vars
   : TYPE ident '=' (integertype | floattype | literal)
   ;

procedure
   : DEF ident block
   ;

statement
   : (assign | call |  printmess | beginfunc | ifthen | whiledo | breakfunc | continuefunc)
   ;

assign
   : ident '=' (expression | literal)?
   ;

call
   : CALLF ident
   ;

breakfunc
    : BREAKF
    ;

continuefunc
    : CONTINUEF
    ;

printmess
   : PRINTEXPR '('(expression | literal) ')'
   ;

beginfunc
   : '{' statement (statement)* '}'
   ;


ifthen
   : IF orandcheck THEN statement
   ;

whiledo
   : WHILE orandcheck DO statement
   ;

orandcheck
   : condition (check = ORAND condition)*
   ;

condition
   : '(' expression (check = SIGN) expression ')' # cond_expr_all
   | expression # cond_expr
   ;

expression
   : expression op = ('+'| '-') term #expr_op
   | term #term_expr
   ;

term
   : factor #factor_term
   | term op = ('/' | '*') factor #term_op
   ;

factor
   : ident # ident_factor
   | integertype # integer_factor
   | floattype # float_factor
   | '(' expression ')' # expr_factor
   ;

TYPE          : 'int' | 'float';

DEF           : 'def';

CALLF         : 'call';

PRINTEXPR     : 'print';

IF            : 'if';

THEN          : 'then';

WHILE         : 'while';

DO            : 'do';

SIGN          : ('==' | '!=' | '<' | '<=' | '>' | '>=');

ORAND         : ('or' | 'and');

BREAKF        : 'break';

CONTINUEF     : 'continue';

ident         : STRING (STRING|NUMBER)*;

integertype   : '-'? NUMBER;

floattype     : '-'? NUMBER'.'NUMBER;

literal       : STRINGLITERAL;

STRINGLITERAL : '"' ~["\r]* '"';

STRING        : [a-zA-Z]+;

NUMBER        : [0-9]+;

OneComment    : '//' .*? '\n' -> channel (HIDDEN);

ManyComment   : '/*' .*? '*/' -> channel (HIDDEN);

WS            : [ \t\r\n] -> channel (HIDDEN);