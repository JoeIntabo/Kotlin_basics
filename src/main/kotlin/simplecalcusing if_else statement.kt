fun main(args: Array<String>) {
    print("Enter first number:")
    val num1= readln().toDouble()
    print("Enter operator: ")
    val opp= readln()
    print("Enter second number:")
    val num2= readln().toDouble()
    val result= if (opp == "+"){
        num1+num2
        }else if (opp == "-"){
            num1-num2
        }else if (opp == "*"){
            num1*num2
        }else if (opp == "/"){
            num1/num2
        }else{
            "invalid operator"
        }
    println("results = $result")
}