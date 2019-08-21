package behavioral.state

class StartState: State {
    override fun doAction(context: Context) {
        println("Player is in start state")
        context.state = this
    }

    override fun toString(): String {
        return this.javaClass.simpleName
    }

}