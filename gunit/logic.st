var int a;
var int b;
var int c;
var int d;

b := c := 5;
a := 3;
d := 7;
print(b == c); //True
print(b <> c); //False
print(b <  c); //False
print(b >  c); //False
print(b <= c); //True
print(b >= c); //True


print(a == b); //False
print(a <> b); //True
print(a <  b); //True
print(a >  b); //False
print(a <= b); //True
print(a >= b); //False

print(d == c); //False
print(d <> c); //True
print(d <  c); //False
print(d >  c); //True
print(d <= c); //False
print(d >= c); //True