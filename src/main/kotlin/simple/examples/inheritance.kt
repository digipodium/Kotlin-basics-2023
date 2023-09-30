package simple.examples

open class Person(
    open val name: String,
    val age: Int,
    val gender: String,
) {
    fun details() {
        println("Here are the details of the ${this.javaClass.simpleName}")
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
        println("--------------------")
    }
}

// Inheritance
// class SubClass() : SuperClass(){
// }
class Student(
    override val name: String,
    val stdAge: Int,
    val stdGender: String,
    val stdClass: String = "NA",
) : Person(name, stdAge, stdGender)

fun main() {
    val p1 = Person("Rajesh", 25, "Male")
    val s1 = Student("Ramesh", 6, "Male", "KG")
    val s2 = Student("Arti", 8, "Female", "1st" )

    p1.details()
    s1.details()
    s2.details()
}