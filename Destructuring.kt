package hello;
//Destructuring Declaration
data class Customerr(var name:String,val age :Int){
}
//function that return multiple values
data class Result(var x:Int , var y:Int ,var z:Int)
fun calculateVector():Result{
    return Result(1,5,6);
}
fun main(args: Array<String>) {
    var customer = Customerr("Adam Khanh",18);
    var (name,age) = customer;
   println("Name = ${name},age = ${age}");

    var customer1=Customerr("Eva Ngoc",19);
    var customers= listOf<Customerr>(customer,customer1);
    for ((name,age) in customers){
        println("Name = ${name},age ${age}");
    }
    var (x,y,z) = calculateVector();
    println("x1 = $x , y1 = $y , z1 = $z");
    //map
    var userObject= mapOf<String , Any?>("name" to "Khanh", "age"  to 19 );
    for ((key,value) in userObject){
        println("key = $key, value = $age");
    }
}