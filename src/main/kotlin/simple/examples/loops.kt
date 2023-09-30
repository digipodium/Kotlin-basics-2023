package simple.examples

fun main() {
    // loops in kotlin
    //1. for loop
    for (i in 1..10) {
        print("$i ")
    }
    println() // prints a new line
    for (i in 1..10 step 2) {
        print("$i ")
    }
    println()
    //2. while loop
    var x = 10
    while (x > 0) {
        print("$x ")
        x-- // x = x - 1 (decrement)
    }

    //3. do while loop
    println()
    var z = 10
    do {
        print("$z ")
        z--
    } while (z > 0)
    // important
    //4. forEach loop - traverse through a collection(data)
    println()
    val numbers = listOf(1, 2, 3, 4, 5)
    val names = listOf("Alex", "Alexa", "Alexis","Alexander")
    numbers.forEach {
        print("$it ")
    }
    names.forEach { name ->
        println(name)
    }
    //5. forEachIndexed loop
    names.forEachIndexed { idx, name ->
        println("$idx: $name")
    }
    //6. break and continue
    //7. repeat loop
    repeat(5) {
        print("hello")
    }

}