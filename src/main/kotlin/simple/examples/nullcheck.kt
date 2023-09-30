package simple.examples

fun main() {
    var a: Int? = null
    println(a)
    a = 10
    println(a)
    var name: String? = "Zaid"
    var city = "Lucknow"
    println(name)
    name = null
    println(name)
    println(city)
    println(city.length)
    println(name?.length?:"Name is null")
    name = "Alexander"
    println(name?.length)
}