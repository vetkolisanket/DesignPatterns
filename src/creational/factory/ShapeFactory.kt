package creational.factory

import creational.factory.Shape.Companion.CIRCLE
import creational.factory.Shape.Companion.RECTANGLE
import creational.factory.Shape.Companion.SQUARE

object ShapeFactory {
    fun getShape(shapeType: String): Shape {
        return when (shapeType) {
            RECTANGLE -> Rectangle()
            SQUARE -> Square()
            CIRCLE -> Circle()
            else -> throw IllegalArgumentException("$shapeType is not a valid shape!")
        }
    }
}