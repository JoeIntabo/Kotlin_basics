import kotlin.math.exp
import kotlin.math.sqrt

fun main(args: Array<String>) {
    println(sqrt(45.789))
    println(exp(39.89))
    Myfunction("Joe","Intabo",18)
    Myfunction("Albert","Wahome",90)
    Myfunction("Collins","Njoroge",87)
    matata()
}
fun Myfunction(fname:String,lname:String,age:Int){
    println("My name is $fname $lname and I am $age years old")

}
fun matata(){
    println("Hakuna Matata")
}