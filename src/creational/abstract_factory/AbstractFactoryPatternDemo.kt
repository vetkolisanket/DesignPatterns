package creational.abstract_factory

const val RECTANGLE = "RECTANGLE"
const val SQUARE = "SQUARE"
const val CIRCLE = "CIRCLE"

const val RED = "RED"
const val GREEN = "GREEN"
const val BLUE = "BLUE"

const val SHAPE = "SHAPE"
const val COLOR = "COLOR"

fun main() {
    val shapeFactory = FactoryProducer.getFactory(SHAPE)
    val colorFactory = FactoryProducer.getFactory(COLOR)

    shapeFactory?.let {
        val rectangle = it.getShape(RECTANGLE)
        val square = it.getShape(SQUARE)
        val circle = it.getShape(CIRCLE)

        rectangle?.draw()
        square?.draw()
        circle?.draw()
    }

    colorFactory?.run {
        val red = this.getColor(RED)
        val green = this.getColor(GREEN)
        val blue = this.getColor(BLUE)

        red?.fill()
        green?.fill()
        blue?.fill()
    }
}