package creational.abstract_factory

class ShapeFactory: AbstractFactory() {
    override fun getColor(color: String): Color? {
        return null
    }

    override fun getShape(shape: String): Shape? {
        return when (shape) {
            RECTANGLE -> Rectangle()
            SQUARE -> Square()
            CIRCLE -> Circle()
            else -> null
        }
    }
}