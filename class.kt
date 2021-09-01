package hello
//class Person constructor(val firstName:String,val lastName:String,var age :Int?){
open class Person ( open val firstName:String,val lastName:String,var age :Int?){
    private val fullName="$firstName $lastName";
    //initializer blocks
    init {
        println("firstname= $firstName, lastname = $lastName, age = $age");
    }
    open fun talk (message : String = " "){
     //   println("$fullName $message");
        println("$firstName $lastName says $message");
    }
    //getter nad setter
}
class Engineer(var fielOfStudy:String , firstName: String,lastName: String,age: Int?): Person(firstName,lastName,age){
    override val firstName = super.firstName.toUpperCase();
    //final override fun talk(message : String)
    override fun talk(message: String) {
        super.talk(message);
        println("I am a student");
    }
}
fun main(args:Array<String>){
//    var person = Person(firstName = "David",lastName = "Teo",age = null);
//    println("Function details : firstname= ${person.firstName} , lastname = ${person.lastName}");
//    var person = Person(firstName = "David",lastName = "Tung",age = 35);
//    println("Function details : firstname= ${person.firstName} , lastname = ${person.lastName}");
//    person.talk("Good morning");
    var engineer:Engineer = Engineer(fielOfStudy = "PHP",firstName = "Adam",lastName = "Hau",age = 20);
    println("Details.Fistname = ${engineer.firstName} , "+
    "lastname = ${engineer.lastName}, age = ${engineer.age} , study = ${engineer.fielOfStudy}");
    engineer.talk("Good evening");
}