package structural.flyweight

object ShapeFactory {
    private val circleMap = mutableMapOf<String, Circle>()

    fun getCircle(color: String): Circle {
        var circle = circleMap[color]

        if (circle == null) {
            circle = Circle(color)
            circleMap[color] = circle
            println("Creating circle of color: $color")
        }
        return circle
    }
}