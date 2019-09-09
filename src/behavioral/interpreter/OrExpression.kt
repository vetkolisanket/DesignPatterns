package behavioral.interpreter

class OrExpression(val expr1: Expression, val expr2: Expression): Expression {
    override fun interpret(context: String): Boolean {
        return expr1.interpret(context) or expr2.interpret(context)
    }
}