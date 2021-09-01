package hello;
class Fruit(){
    private var watermelon:String="Dưa hấu";
    private var grapes:String="Nho";
    private var greenApple:String="Táo xanh";
    class Nested{
        fun sayHello(){
            //grapes // can not access to "grapes"
            println("i am a function inside a Nested class")
        }
    }
    inner class Inner{
        fun getAppleEmoji():String {
            println("i am a function inside a Inner class")
            println("Apple is $greenApple");
            return greenApple;
        }
    }
}
fun main(args:Array<String>){
    Fruit.Nested().sayHello();
    var fruit=Fruit();
    fruit.Inner().getAppleEmoji();
}