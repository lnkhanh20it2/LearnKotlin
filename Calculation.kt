class Calculation(){
    companion object{
        fun PI(): Float=3.146F;
    }
}
fun Calculation.Companion.doublePi():Float{
    return 2*Calculation.Companion.PI();
}