package simple.examples


fun main() {
    val square: (Int) -> Int = { it * it }
    println(square(5))
    val ds = DoSomething {
        println("Clicked $it")
    }
    ds.doClick()
    val ds2 = DoMoreThing{
        println("Tapped")
    }
}
class DoSomething(
    val click: (String) -> Unit
){
    fun doClick(){
        click("Button")
    }
}
class DoMoreThing(
    val tap: () -> Unit
){
    fun doTap(){
        tap()
    }
}