package behavioral.strategy

class MultiplyOperation: Strategy {
    override fun doOperation(num1: Int, num2: Int): String {
        return "$num1 * $num2 = ${num1 * num2}"
    }
}