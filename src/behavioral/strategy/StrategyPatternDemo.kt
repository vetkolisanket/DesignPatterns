package behavioral.strategy

fun main() {
    val context = Context()

    context.setStrategy(AddOperation())
    context.performOperation(10, 5)

    context.setStrategy(SubtractOperation())
    context.performOperation(10, 5)

    context.setStrategy(MultiplyOperation())
    context.performOperation(10, 5)

}