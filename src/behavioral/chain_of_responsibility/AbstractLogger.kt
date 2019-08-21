package behavioral.chain_of_responsibility

abstract class AbstractLogger(val level: Int) {

    companion object {
        const val INFO = 1
        const val DEBUG = 2
        const val ERROR = 3
    }

    var nextLogger: AbstractLogger? = null

    protected abstract fun write(message: String)

    fun logMessage(level: Int, message: String) {
        if (this.level <= level) {
            write(message)
        }
        nextLogger?.logMessage(level, message)
    }

}