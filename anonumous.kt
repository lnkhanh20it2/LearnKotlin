/**
 * @author Khanh
 * Lambda and anonymous
 */

package hello;
//fun sum(x:Double,y:Double):Double{
//    return x+y;
//}
//var sum = {x:Double,y:Double -> x + y }
//var sum:(Double , Double ) -> Double ={ x , y -> x + y }

//Anonymous Functions
var sum=fun(x:Double,y:Double):Double{
    return x+y;
}
//Anonymous Functions without return value
var sayHello = fun(personName:String){
        println("this is an anonymous function");
        println("Hello ${personName}");
}
fun main(args :Array<String>) {
        println("Sum =${sum(10.1,11.2)}");
        sayHello("Khanh");
        var doubles= doubleArrayOf(10.0,11.1,12.2,13.3,14.4);
        doubles.forEach { eachNumber-> println(eachNumber) };
}