package behavioral.chain_of_responsibility

class FileLogger(level: Int): AbstractLogger(level) {
    override fun write(message: String) {
        println("File::Logger: $message")
    }
}