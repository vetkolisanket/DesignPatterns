package behavioral.chain_of_responsibility

fun main() {
    val loggerChain = getChainOfLoggers()

    loggerChain.logMessage(AbstractLogger.INFO, "This is an information.")
    loggerChain.logMessage(AbstractLogger.DEBUG, "This is debug level information")
    loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information")
}

fun getChainOfLoggers(): AbstractLogger {
    val errorLogger = ErrorLogger(AbstractLogger.ERROR)
    val fileLogger = FileLogger(AbstractLogger.DEBUG)
    val consoleLogger = ConsoleLogger(AbstractLogger.INFO)

    errorLogger.nextLogger = fileLogger
    fileLogger.nextLogger = consoleLogger

    return errorLogger
}