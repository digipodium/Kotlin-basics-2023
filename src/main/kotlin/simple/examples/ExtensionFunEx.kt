package simple.examples

fun main() {
    val r1 = Rectangle(10.0, 25.0)
    val ans = r1.isSquare()
    println(ans)
    val t1 = Triangle(10.0, 10.0, 10.0)
    println(t1.isEquilateral())
}

// extension function
fun Rectangle.isSquare(): Boolean {
    return length == breadth
}

fun Triangle.isEquilateral(): Boolean {
    return a == b && b == c
}