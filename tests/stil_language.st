var int ivar;

ivar := {
    var int ivar1;
    var int ivar2;

    read(ivar1, ivar2);
    print(ivar1, ivar2);

    const int iconst1 := 1;
    const int iconst2 := 2;

    ivar2 := ivar1 := +16 + 2 * -8;

    print(  ivar1 < ivar2 && iconst1 <= iconst2, 
            iconst1 * iconst2 > ivar2 - ivar1);

    ivar1 < read(ivar2) && iconst1 <= iconst2;

    ivar2 := print(ivar2) + 1;
} + 1;

var bool bvar;

bvar := {
    var bool bvar;

    read(bvar);
    print(bvar);

    bvar := 12 / 5 * 5 + 12 % 5 == 12 && 6 >= 6;

    const bool bconst := true;

    print(!false && bvar == bconst || true <> false);
} && true;

var char cvar;

cvar := {
    var char cvar1;
    var char cvar2;

    read(cvar1);

    const char cconst := 'c';

    cvar2 := 'z';

    print('a', cvar1 == cconst && (cvar2 <> 'b' || !true));

    'b';
};

print(ivar, bvar, cvar);

if(bvar) {
    print(true);
}

if(!bvar) {
    print(false);
}

const int i = 0;
const int j = 1;

while(i <= j) {
    if(i == j) { 
        print(true); 
    } else {
        print(false); 
    }

    i := i + 1;
}

while(i > j) {
    print(true);
}