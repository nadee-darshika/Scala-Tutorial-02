val k,i,j : Int = 2;
val m,n : Int = 5;
val f : Float = 12.0f;
val g : Float = 4.0f;
val c : Char = 'X';

k+12*m                // res1: Int = 62
m/j                   // res2: Int = 2
n%j                   // res3: Int = 1
f+10*5+g              // res4: Float = 66.0

++j*n   
/* <console>:12: error: not found: value ++
       ++j * n
       ^
<console>:12: error: not found: value *
       ++j * n
           ^  */
