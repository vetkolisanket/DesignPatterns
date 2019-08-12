package behavioral.mediator

import java.util.*

object ChatRoom {

    fun showMessage(user: User, message: String) {
        println("${Date()} + [${user.name}] : $message")
    }

}