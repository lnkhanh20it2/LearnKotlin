package package1

import package2.ClassD

private class ClassC {
    init {
        println("Initialize Class C");
    }
}
fun accessClassC(){
    var classC= ClassC();
}