open class Animal(colour:String, age:Int){
    init {
        println("Colour is: $colour")
        println("Age is:$age months")
    }
}
class Dog(colour: String,age: Int):Animal(colour, age){
    fun woof(){
        println("Dog makes sound woof")
    }
}
class Cat(colour: String, age: Int): Animal(colour, age) {

    fun meow() {
        println("Cat makes sound of meow")
    }
}

class Horse(colour: String, age: Int): Animal(colour, age) {

    fun neigh() {
        println("Horse makes sound of neigh")
    }
}
class Tiger(colour: String,age: Int):Animal(colour,age){
    fun roar(){
        println("A tiger roars")
    }
}

fun main(args: Array<String>) {
    val dog=Dog("Black",2)
    dog.woof()
    val cat=Cat("White with a shade of brown",3)
    cat.meow()
    val horse=Horse("Brown",12)
    horse.neigh()
    val tiger=Tiger("White with orange stripes",10)
    tiger.roar()
}