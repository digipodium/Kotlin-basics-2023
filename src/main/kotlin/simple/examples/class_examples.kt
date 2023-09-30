package simple.examples

class Address(
    private val houseNo: String,
    private val street: String,
    private val city: String,
) {
    override fun toString() = "$houseNo,\n$street,\n$city"
}

data class Book(
    val title: String,
    val author: String,
    val publisher: String,
    val price: Double,
)

fun main() {
    val address = Address("123", "Main Street", "New York")
    println(address)
    val b1 = Book("The final empire", "Brandon Sanderson", "Tor Books", 7.99)
    val b2 = Book("The well of ascension", "Brandon Sanderson", "Tor Books", 7.99)
    println(b1)
    println(b2)
}