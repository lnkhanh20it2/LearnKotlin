/**
 * @author Ngoc Khanh
 * Delegated properties in kotlin
 */
package hello

import kotlin.reflect.KProperty

class Users{
    var todayTasks:String by DelegatedUser()
}
class DelegatedUser{
    operator fun getValue(thisRef:Any?,property:KProperty<*>):String{
        return "$thisRef, thank for delegation '${property.name}' to me !";
    }
    operator fun setValue (thisRef:Any?,property:KProperty<*>,value:String){
        println("assigned to '${property.name} in $thisRef . Details: $value'");
    }
}

fun main(args:Array<String>) {
    var users=  Users();
    println(users.todayTasks);
    users.todayTasks = "Kotlin"
}