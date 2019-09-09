package behavioral.interpreter

fun getMaleExpression(): Expression {
    val robert = TerminalExpression("Robert")
    val john = TerminalExpression("John")
    return OrExpression(robert, john)
}

fun getMarriedWomanExpression(): Expression {
    val julie = TerminalExpression("Julie")
    val married = TerminalExpression("Married")
    return AndExpression(julie, married)
}

fun main() {
    val isMale = getMaleExpression()
    val isMarriedWoman = getMarriedWomanExpression()

    println("John is male? ${isMale.interpret("John")}")
    println("Julie is a married woman? ${isMarriedWoman.interpret("Married Julie")}")
}