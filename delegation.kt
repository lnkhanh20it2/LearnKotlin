/**
 * @author Ngoc Khanh
 * Delegation in kotlin
 */
package hello;
interface BirdInterface{
    fun flyAndFindFood()
}
class Eagle(val age:Int):BirdInterface{
    override fun flyAndFindFood() {
        println("I am an eagle. I am $age years old . I am flying and finding food");
    }
}
class Cuckoo(b:BirdInterface):BirdInterface by b{
    override fun flyAndFindFood() {
        println("I am a Cuckoo. I am flying and finding food");
    }
}
fun main(args :Array<String>){
    val eagle = Eagle(2);
    eagle.flyAndFindFood();
    var cuckoo= Cuckoo(eagle);
    cuckoo.flyAndFindFood();
}