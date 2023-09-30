package something

import simple.examples.mod1.Cls1

class Cls3 {
    fun show(){
        val obj = Cls1()
        println(obj.x) // x is public, so can be accessed
        println(obj.w) // w is internal, so can be accessed
    }
}