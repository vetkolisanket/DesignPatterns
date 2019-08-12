package behavioral.mediator

fun main() {
    val sanket = User("Sanket")
    val sandeep = User("Sandeep")

    sanket.sendMessage("Hi Sandeep!")
    sandeep.sendMessage("Hello Sanket!")
}