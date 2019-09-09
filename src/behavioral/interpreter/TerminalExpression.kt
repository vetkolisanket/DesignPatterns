package behavioral.interpreter

class TerminalExpression(val data: String): Expression {
    override fun interpret(context: String): Boolean {
        return context.contains(data)
    }
}