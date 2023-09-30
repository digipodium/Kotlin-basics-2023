package simple.examples

interface Measurement {
    fun area(): Double
    fun perimeter(): Double
    fun volume(height: Double): Double
}

class Rectangle(
    val length: Double,
    val breadth: Double,
) : Measurement {
    override fun area(): Double {
        return length * breadth
    }

    override fun perimeter(): Double {
        return 2 * (length + breadth)
    }

    override fun volume(height: Double): Double {
        return area() * height
    }
}

class Triangle(
    val a: Double,
    val b: Double,
    val c: Double,
) : Measurement {
    override fun area(): Double {
        val s = perimeter() / 2 // s is half of perimeter
        return s * (s - a) * (s - b) * (s - c)
    }

    override fun perimeter(): Double {
        return a + b + c
    }

    override fun volume(height: Double): Double {
        return 0.0
    }

}