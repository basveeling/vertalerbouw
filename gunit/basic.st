var bool a;
var bool b;
var bool c;

read(a);
read(b);

c := (a && !b) || (!a && b);

a := b := 4+2;

a := c + (3*5+2/-1%+2);

read(a, b);

c := c && (a + 2/+2 -1) > 0;

// comment
c := { 
	read(b);
	!b;
};

print(a,b,c);
