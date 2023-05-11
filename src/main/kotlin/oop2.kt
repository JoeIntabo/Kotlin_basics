class Math{
    var num:Int=21
    var num2:Int=56
    var num3:Int=78

    fun calc():Int{
        return num*num2/num3
    }
}

fun main(args: Array<String>) {
    val obj=Math()
    println(obj.calc())
}