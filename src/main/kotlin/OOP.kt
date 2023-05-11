class Sturborn{
    //data member
    var num:Int=32
    //number function
    fun calculate():Int{
        return num * num
    }
}
class eMobilis{
    //data member
    var num1:Int=7
    //member function
    fun hesabu():Int{
        return num1*num1
    }
}

fun main(args: Array<String>) {
    //This is an object
    val myobject=Sturborn()
    println(myobject.calculate())
    //Create object
    val obj=eMobilis()
    println(obj.hesabu())
}
