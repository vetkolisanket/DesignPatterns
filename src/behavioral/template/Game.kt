package behavioral.template

abstract class Game {
    abstract fun initialize()
    abstract fun startPlay()
    abstract fun endPlay()

    //template method
    fun play() {
        initialize()
        startPlay()
        endPlay()
    }
}