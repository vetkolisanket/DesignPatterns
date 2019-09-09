package behavioral

interface Expression {
    fun interpret(context: String): Boolean
}