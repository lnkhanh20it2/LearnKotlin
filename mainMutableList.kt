package hello;

import doublePi
import swap2Elements

class A{
    fun methodA(){
        println("method A of class A");
    }
    fun methodX(){
        println("method X of class A");
    }
    fun B.methodB2(){
       methodA()
        this.methodB()
        this.methodX();
    }
    fun callB2fromA(b:B){
        b.methodB2();
    }
}
class B{
    fun methodB(){
        println("method B of class B");
    }
    fun methodX(){
        println("method X of class B");
    }
}

fun main(args:Array<String>){
    var listOfString:MutableList<String> = mutableListOf("Zero","One","Two","Three","Four");
    listOfString.swap2Elements(0,3);
    println("$listOfString");
    println("pi = ${Calculation.PI()}");
    println("pi = ${Calculation.doublePi()}");
    var b=B();
    //b.methodB2()
    var a=A();
    a.callB2fromA(b);
}