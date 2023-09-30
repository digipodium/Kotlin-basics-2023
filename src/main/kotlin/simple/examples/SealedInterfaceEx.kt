package simple.examples

sealed interface AppAction {
    object Save : AppAction
    object Delete : AppAction
    object Update : AppAction
    data class SetFirstName(val firstName: String) : AppAction
    data class SetLastName(val lastName: String) : AppAction
}

class HandleActions{
    fun onAction(action:AppAction){
        when(action){
            AppAction.Delete -> TODO()
            AppAction.Save -> TODO()
            is AppAction.SetFirstName -> TODO()
            is AppAction.SetLastName -> TODO()
            AppAction.Update -> TODO()
        }
    }
}