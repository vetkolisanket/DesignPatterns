package behavioral.state

fun main() {
    val context = Context()

    val startState = StartState()
    startState.doAction(context)
    println(context.state)

    val stopState = StopState()
    stopState.doAction(context)
    println(context.state)
}