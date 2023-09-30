package simple.examples

fun main() {
    println(simpleInterest(12000, 11f, 5))
    println(simpleInterest(11000, 6f, 5))
    println(area(12))
    println(area(12, 14))
    println(area(b = 15, l = 14))
    println(area(l = 13, b = 14))
}

fun simpleInterest(p: Int, r: Float, t: Int): Float {
    return p * r * t / 100
}

fun area(l: Int, b: Int = 1) = l * b