package creational.prototype

const val RECTANGLE = "RECTANGLE"
const val SQUARE = "SQUARE"
const val CIRCLE = "CIRCLE"

fun main() {
    ShapeCache.loadCache()

    val circle = ShapeCache.getShape("1")
    println("Shape : ${circle.type}")

    val square = ShapeCache.getShape("2")
    println("Shape : ${square.type}")

    val rectangle = ShapeCache.getShape("3")
    println("Shape : ${rectangle.type}")
}