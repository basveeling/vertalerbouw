var int i;
const bool success := true;

if(success) {
    var int i ;
    
    if(!success) {
        var bool result;

        result := {
            const int i := 1;
            const int j := 2;

            i <= j;
        };

        var bool foo;

        foo := {
            var bool foo;

            if(true || false) { 
                foo := true;
            } else {
                foo := false;
            }

            foo;
        };

        if(result && foo) {
            i := 3;
        }
    }

    print(i);
}