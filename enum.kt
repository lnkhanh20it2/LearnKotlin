package hello
enum class CompassDirection{
    EAST,
    WEST,
    SOUTH,
    NORTH
}
enum class Color(val red:Int,val blu:Int,var green:Int){
    RED(255,0,0),
    BLU(0,255,0),
    GREEN(0,0,255)
}
enum class ActionState{
    ACTIVE{
        override fun reverseAction()=INACTIVE
    },
    INACTIVE{
        override fun reverseAction()=ACTIVE
    };
    abstract fun reverseAction():ActionState
}
fun main(args :Array<String>){
    println("North enum = ${CompassDirection.NORTH}");
    println(Color.BLU.toString());
    println("Color details name = ${Color.GREEN},ordinal = ${Color.GREEN.ordinal} ");
    println(Color.valueOf("BLU"));
    //println(Color.valueOf("BLU123"));
    for (colorValue in Color.values()){
        println("Color value is $colorValue");
    }
    println(ActionState.ACTIVE.reverseAction());
    println(ActionState.INACTIVE.reverseAction())
}