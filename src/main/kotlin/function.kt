//creating a function
fun joe(){
    println("This is customized user defined function")
}
fun math(){
    val num=3
    val num2=77
    println("The sum of $num and $num2 is ${num+num2}")
}
fun account(){
    print("Enter your name:")
    val name= readln()
    print("Enter your email:")
    val email=readln()
    println("Your name is $name and your email is $email.Please confirm this.")
}
fun main(args: Array<String>) {
    joe()
    math()
    account()
}