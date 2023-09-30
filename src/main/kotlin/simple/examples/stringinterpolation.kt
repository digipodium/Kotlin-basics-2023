package simple.examples

fun main(){
    println("Enter your name")
    val name:String = readln() // user input function
    println("Enter your city")
    val city:String = readln()
    println("Enter your age")
    val age: Int = readln().toInt()
    // String interpolation
    println("Name: $name")
    println("City: $city")
    println("Age: $age")
    println("You name length is ${name.length}")
    // $variable or ${expression}
}