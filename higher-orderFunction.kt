/**
 * @author Khánh
 * Higher-order Fundtion
 */

package hello

import java.util.*;

class Look(){
    fun look(){
        println("I locked the process");
    }
    fun unlook(){
        println("I unlocked the process");
    }
}
var bodyFunction = fun():Int{
    var taskId= Random().nextInt();
    println("this is the body function. TaskId = $taskId");
    return taskId;
}
fun doATask(look: Look,body: () -> Int): Int{
    look.look();
    try{
        return body();
    }
    finally {
        look.unlook();
    }
}
//Ex2:function that takes function as parameters , return a value
val compare:(Int,Int)->Boolean = {x , y -> x < y};
fun getMaxValueIntCollection(collection: Collection<Int>,less:(Int,Int)->Boolean):Int?{
    var maxValue:Int? = null;
    for (item in collection){
        if (maxValue==null || less(maxValue,item))
            maxValue=item;
    }
    return maxValue;
}
fun main(args: Array<String>) {
    doATask(Look(), bodyFunction);
    var ints:Collection<Int> = listOf(1,2,3,4,10,6);
    var maxValue = getMaxValueIntCollection(ints, compare);
    println("Max value = $maxValue")
}
