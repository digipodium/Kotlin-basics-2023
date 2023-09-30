package simple.examples

enum class Status{
    LOADING,
    SUCCESS,
    ERROR,
    NOTHING
}

class StatusCheck(
    val status: Status
){
    fun showStatus(){
        when(status){
            Status.LOADING -> println("Loading...")
            Status.SUCCESS -> println("Success")
            Status.ERROR -> println("Error")
            Status.NOTHING -> println("Nothing")
        }
    }
}

fun main(){
    val obj = StatusCheck(Status.ERROR)
    obj.showStatus()
}