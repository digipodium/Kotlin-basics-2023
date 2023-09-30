package simple.examples

data class BookDelivery(
    val book: Book,
    val address: Address,
)

fun main(){
    val b1 = Book("The final empire", "Brandon Sanderson", "Tor Books", 7.99)
    val a1 = Address("123", "Main Street", "New York")
    val d1 = BookDelivery(b1, a1)

    val b2 = Book("The well of ascension", "Brandon Sanderson", "Tor Books", 7.99)
    val a2 = Address("45", "Wall Street", "New York")

    val d3 = BookDelivery(b1, a2)
    val d2 = BookDelivery(b2, a2)

    println(d1)
    println(d2)
    println(d3)
}