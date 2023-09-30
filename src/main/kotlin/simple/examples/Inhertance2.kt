package simple.examples

open class Car(
    val model: String,
    val brand: String,
) {
    open fun info() {
        println("${this::class.simpleName}")
        println("Model: $model")
        println("Brand: $brand")
    }
}

class SportsCar(
    val spModel: String,
    val spBrand: String,
    val topSpeed: Int,
    val horsePower: Int,
) : Car(spModel, spBrand) {
    override fun info() {
        super.info()
        println("Top Speed: $topSpeed")
        println("Horse Power: $horsePower")
    }
}

class SedanCar(
    val sdModel: String,
    val sdBrand: String,
    val enginType: String,
    val seatingCapacity: Int,
) : Car(sdModel, sdBrand) {
    override fun info() {
        super.info()
        println("Engine Type: $enginType")
        println("Seating Capacity: $seatingCapacity")
    }
}

fun main() {
    val c1 = Car("Civic", "Honda")
    val sp1 = SportsCar("Mustang", "Ford", 250, 500)
    val sp2 = SportsCar("Aventador", "Lamborghini", 350, 700)

    c1.info()
    sp1.info()
    sp2.info()

}