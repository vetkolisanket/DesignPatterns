package structural.flyweight

import kotlin.random.Random

val colors = arrayOf("Red", "Green", "Blue", "White", "Black")

fun main() {
    for (i in 1..20) {
        val circle = ShapeFactory.getCircle(colors.random())
        circle.setX(Random.nextInt(100))
        circle.setY(Random.nextInt(100))
        circle.setRadius(Random.nextInt(100))
        circle.draw()
    }
}