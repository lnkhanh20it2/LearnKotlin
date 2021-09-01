/**
 * @author Khánh
 * Observable
 */
package hello

import kotlin.properties.Delegates

class Userss(name:String){
    var currentAddress:String by Delegates.observable("no address") {
        prop,oldAddress,newAddress->run{
            println("Address is changing");
            println("form $oldAddress -> $newAddress")
            println("properties's name= ${prop.name}")
         }
    }
}
//Storing properties in a Map =like to "store a json with key-value pairs
var userObject= mutableMapOf<String,Any?>("name" to "Khanh","age" to 19);

class Customer(mapObject:Map<String,Any?>){
    val name :String by mapObject;
    val age :Int by mapObject;
}
fun main(args: Array<String>) {
    val user = Userss("Lee Ngoc Khanh");
    user.currentAddress="thon 3 xa Song Tra \n"+
                        "Hiep Duc Quang Nam \n"+
                        "Viet Nam"
    user.currentAddress="Thang Binh Hiep DUc QUang Nam ";
    println("User's details . Name is ${userObject.getValue("name")} . Age = ${userObject.get("age")}");
    userObject.set("age",20);
    println("User's details . Name is ${userObject.getValue("name")} . Age = ${userObject.get("age")}");
    val customer = Customer(mapOf(
            "name" to "Ngoc Khanh",
            "age" to 21
    ))
    println("Customer's details.Name = ${customer.name} , age =${customer.age}");

}
