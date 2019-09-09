package behavioral.interpreter

class AndExpression(val expr1: Expression, val expr2: Expression) : Expression {
    override fun interpret(context: String): Boolean {
        return expr1.interpret(context) and expr2.interpret(context)
    }
}