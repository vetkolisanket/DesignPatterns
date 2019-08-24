package structural.bridge

class Circle(private val x: Int, private val y: Int, private val radius: Int, drawAPI: DrawCircleAPI): Shape(drawAPI) {
    override fun draw() {
        drawAPI.drawCircle(radius, x, y)
    }
}