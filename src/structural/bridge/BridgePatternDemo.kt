package structural.bridge

fun main() {
    val redCircle = Circle(100, 100, 10, RedCircle())
    val greenCircle = Circle(100, 100, 10, GreenCircle())

    redCircle.draw()
    greenCircle.draw()
}