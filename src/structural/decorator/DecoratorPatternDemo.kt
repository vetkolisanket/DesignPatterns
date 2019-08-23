package structural.decorator

fun main() {
    val circle = Circle()

    val redCircle = RedShapeDecorator(circle)
    val redRectangle = RedShapeDecorator(Rectangle())

    println("Circle with normal border")
    circle.draw()

    println("\n\nCircle with red border")
    redCircle.draw()

    println("\nRectangle with red border")
    redRectangle.draw()
}