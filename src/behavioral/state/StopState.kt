package behavioral.state

class StopState: State {
    override fun doAction(context: Context) {
        println("Player is in stop state")
        context.state = this
    }

    override fun toString(): String {
        return this.javaClass.simpleName
    }

}