

class Student{
    constructor(name: String, age: Int,gender:String,course:String){
        println("Student Name: ${name.toUpperCase()}")
        println("Student Age: $age")
        println("Student Gender: $gender")
        println("Student Course: $course")


    }}

fun main(args: Array<String>) {
    val obj0=Student("Einstein",25,"Male","Aeronautical Engineering")
}


