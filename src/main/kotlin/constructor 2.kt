class me(val name:String="Einstein",val school:String,val age:Int){

}

fun main(args: Array<String>) {
    val obj=me("Joe","Pioneer School",19)
    println("My name is ${obj.name} and I went to ${obj.school} and finished at the age of ${obj.age} years")
}