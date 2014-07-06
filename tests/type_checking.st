var bool a;
var int b;


// basic test
b := -5;
b := +4;

a := !true;

b := 4 / 2;
b := 2 * 3;
b := 8 % 6;

b := 88 + 23;
b := 2 - 9;

a := 2 < 4;
a := 3 <= 3;
a := 2 > 4;
a := 4 >= 2;

a := 'b' == 'b';
a := 2 == 4;
a := true == false;

a := 'b' <> 'b';
a := 2 <> 4;
a := true <> false;

a := true && false;
a := true || false;

// advanced test
b := 1;

b := 4+b*(6/6)-4%3;

a := (4 >= 2) && (2 >= 2) && !(2 > 2);
