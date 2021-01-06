grammar Gram;

//@header{
//import src.*;
//}

//expression returns [Parent expr] : disj=disjunction {$expr = $disj.expr;}
//                                     | disj1=disjunction IMPL exp1=expression {$expr = new Impl($disj1.expr, $exp1.expr);};
//
//disjunction returns [Parent expr] : conj=conjunction {$expr = $conj.expr;}
//                                      | disj1=disjunction OR conj1=conjunction {$expr = new Dis($disj1.expr, $conj1.expr);};
//
//conjunction returns [Parent expr] : neg=negation {$expr = $neg.expr;}
//                                      | conj1=conjunction AND neg1=negation{$expr = new Conj($conj1.expr, $neg1.expr);};
//
//negation returns [Parent expr] : NOT neg=negation {$expr = new Negative($neg.expr);}
//                                   | var=variable {$expr = $var.expr;}
//                                   | LB exp=expression RB {$expr = $exp.expr;};
//
//variable returns [Parent expr] : VAR {$expr = new Var($VAR.text);};


exp returns [Parent expr]: VAR {$expr = new Var($VAR.text);}
                                | LB exp1=exp RB {$expr = $exp1.expr;}
                                | NOT exp1=exp {$expr = new Negative($exp1.expr);}
                                | exp1=exp AND exp2=exp {$expr = new Conj($exp1.expr, $exp2.expr);}
                                | exp1=exp OR exp2=exp {$expr = new Dis($exp1.expr, $exp2.expr);}
                                | <assoc=right> exp1=exp IMPL exp2=exp {$expr = new Impl($exp1.expr, $exp2.expr);};


NOT: '!';
AND: '&';
OR: '|';
IMPL: '->';
LB : '(';
RB : ')';
VAR: [A-Z]('A'..'Z'|'0'..'9'| '\'')*;
WS: [' '\t\r]+ -> skip;

