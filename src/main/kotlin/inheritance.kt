open class Wazazi{
    val mama="She likes cooking"
    val baba="He likes driving"
}
class boy:Wazazi(){
    fun mvulana(){
        println(baba)
    }
}
class girl:Wazazi(){
    fun msichana(){
        println(mama)
    }

}

fun main(args: Array<String>) {
    val obj1=boy()
    obj1.mvulana()
    val obj2=girl()
    obj2.msichana()
}