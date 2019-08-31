package structural.facade

class ShapeMaker {
    val rectangle by lazy { Rectangle() }
    val square by lazy { Square() }
    val circle by lazy { Circle() }

    fun drawCircle() {
        circle.draw()
    }

    fun drawRectangle() {
        rectangle.draw()
    }

    fun drawSquare() {
        square.draw()
    }

}