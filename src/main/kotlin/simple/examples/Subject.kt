package simple.examples

class Subject(val name: String, val credits: Int) {
    lateinit var books: List<Book>

    // special block of code that is executed
    // when an instance of a class is created
    init {
        println("Subject $name created")
        books = when (name) {
            "DBMS" -> listOf(
                Book(
                    "Database System Concepts", "Abraham Silberschatz",
                    "McGraw-Hill Education", 10.99
                ),
                Book(
                    "Database Management Systems", "Raghu Ramakrishnan",
                    "McGraw-Hill Education", 10.99
                ),
                Book("Database Systems: The Complete Book",
                    "Hector Garcia-Molina", "Pearson", 10.99),
            )
            "DA" -> listOf(
                Book("Design and Analysis of Algorithms",
                    "Alfred V. Aho", "Pearson", 10.99),
            )
            "COI" -> listOf(
                Book("Constitution of Indian", "B.R. Ambedkar", "India", 0.00),
            )
            else -> listOf()
        }
    }

    fun getBooks() {
        println("Books for Subject:$name")
        books.forEach {
            println("${it.title} by ${it.author}")
        }
    }

}

fun main() {
    val dbms = Subject("DBMS", 6)
    val da = Subject("DA", 6)
    val coi = Subject("COI", 4)

    dbms.getBooks()
}