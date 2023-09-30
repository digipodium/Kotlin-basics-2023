package simple.examples.mod1

open class Cls1 {
    val x: Int = 10
    private val z: Int = 20
    protected val y: Int = 30
    internal val w: Int = 40

    open fun show() {
        println("x = $x")
        println("y = $y")
        println("z = $z")
        println("w = $w")
    }
}

class SubCls : Cls1() {
    override fun show() {
        println("x = $x")
        println("y = $y")
        // println("z = $z") // z is private, so can't be accessed
        println("w = $w")
    }
}

class Cls2 {
    fun show() {
        val obj = Cls1()
        obj.show() // fun is public, so can be accessed
        println("x = ${obj.x}") // x is public, so can be accessed
    }
}