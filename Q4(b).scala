def innerCalculate( ticketPrice: Int, attendance: Int) : Int = { return (attendance*ticketPrice) - ( 500 + 3*attendance); };

var incDecPrice = 5;
var incDecAttendance = 20;
println("Enter the normal ticket price: ");
val ticketPrice : Int = scala.io.StdIn.readInt();
println("Enter the attendance for Rs:" + ticketPrice + ": ");
val attendence : Int = scala.io.StdIn.readInt();

var a = innerCalculate(ticketPrice, attendence); 
var b = innerCalculate(ticketPrice+incDecPrice,attendence -incDecAttendance);
var c = innerCalculate(ticketPrice-incDecPrice, attendence +incDecAttendance);

var bp = if ( a>b && a>c) a else if ( b>a && b>c ) b else c;

if( bp ==a )
    println("The best ticket price is Rs:"+ ticketPrice + "\n\n");
else if ( bp ==b)
    println("The best ticket price is Rs:"+ (ticketPrice + incDecPrice)+ "\n\n");
else
    println("The best ticket price is Rs:"+ (ticketPrice - incDecPrice) + "\n\n" );

