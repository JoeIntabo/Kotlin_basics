fun main(args: Array<String>) {
    print("Enter first number:")
    val num1= readln()?.toDouble()?:0.0
    print("Enter operator(+,-,*,/):")
    val operator= readln()
    print("Enter second number:")
    val num2= readln()?.toDouble()?:0.0
    val result = when (operator){
        "+"->num1+num2
        "-" -> num1-num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> {
           println("Invalid operator")
            0.0
        }
    }
    println("result=$result")





}