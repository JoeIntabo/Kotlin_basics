class Students(val name:String,var gender:String,var age:Int){

}

fun main(args: Array<String>) {
    //this is an object
    val obj=Students("Joe","Male",18,)
    val obj1=Students("James","Male",21,)
    val obj2=Students("Grace","female",45,)
    val obj3=Students("Alvin","Male",32,)
    val obj4=Students("Angela","female",25,)
    val obj5=Students("Britttney","female",56,)
    val obj6=Students("Morris","Male",19,)
    println("Student name is ${obj.name} and he is a ${obj.gender} with ${obj.age} years of age " )
    println("Student name is ${obj1.name} and he is a ${obj1.gender} with ${obj1.age} years of age " )
    println("Student name is ${obj2.name} and he is a ${obj2.gender} with ${obj2.age} years of age " )
    println("Student name is ${obj3.name} and he is a ${obj3.gender} with ${obj3.age} years of age " )
    println("Student name is ${obj4.name} and he is a ${obj4.gender} with ${obj4.age} years of age " )
    println("Student name is ${obj5.name} and he is a ${obj5.gender} with ${obj5.age} years of age " )
    println("Student name is ${obj6.name} and he is a ${obj6.gender} with ${obj6.age} years of age " )

}
