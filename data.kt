package hello;
data class User(var name:String,var age:Int){

}
fun main(args :Array<String>){
    var user=User("Adam K",18);
    println(user.toString());
    var backupUser = user.copy();
    user.age=30;
    println("after copy");
    println(user.toString());
    println(backupUser.toString());
    //"hashcode"= object's content
    println(user.hashCode());
    println(backupUser.hashCode());

    if (user.equals(backupUser)){
        println("is same");
    } else {
        println("not same");
    }
}
