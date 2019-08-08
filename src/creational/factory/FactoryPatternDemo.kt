package creational.factory

import creational.factory.Shape.Companion.CIRCLE
import creational.factory.Shape.Companion.RECTANGLE
import creational.factory.Shape.Companion.SQUARE


fun main() {
        val rectangle = ShapeFactory.getShape(RECTANGLE)
        val square = ShapeFactory.getShape(SQUARE)
        val circle = ShapeFactory.getShape(CIRCLE)

        rectangle.draw()
        square.draw()
        circle.draw()
}
