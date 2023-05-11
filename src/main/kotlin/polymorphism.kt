//parent class/super class
open class Shape{
    open fun draw(){
        println("Drawing shape ")
    }

}
//child/sub classes
class Circle:Shape(){
    override fun draw() {
        println("Drawing a Circle")
    }

}
class Square:Shape(){
    override fun draw() {
        println("Drawing a Square")
    }

}
class Triangle:Shape(){
    override fun draw() {
        println("Drawing a Triangle")
    }

}

fun main(args: Array<String>) {
    val shapes:Array<Shape> = arrayOf(Circle(),Square(),Triangle())
    for (shape in shapes){
        shape.draw()
    }
}