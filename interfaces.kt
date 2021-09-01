package interfaces;
class Bat:AnimalInterface,BirdInterface{
    override fun walk() {
        super.walk()
        println("I am a bat . I can walk.")
    }
    override fun fly() {
        super.fly()
        println("I am a bat .I can fly")
    }
    override fun eat() {
        super<BirdInterface>.eat();
        super<AnimalInterface>.eat();
    }
}
fun main(args :Array<String>){
    var bat:Bat = Bat();
    bat.walk();
    bat.fly();
    bat.eat();
}

