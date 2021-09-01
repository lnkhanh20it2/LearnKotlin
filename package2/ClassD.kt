package package2

import package1.ClassA

open class ClassD {
    //private open var y=10
    protected open val p1=1;
    public  open var z=10;
    init {
        println("Initialize Class D");
    }
}
class SubClassD:ClassD(){
    override val p1 = 2;
    override var z=20;
    init {
        println("Access p1 . p1= $p1");
        println("Access z . z= $z");
    }
}
public fun function4(){
    println("this is function 4");
    var classA =  ClassA();
    var subClassD = SubClassD();
   // subClassD.p1;
}