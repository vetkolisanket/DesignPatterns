package creational.abstract_factory

class ColorFactory: AbstractFactory() {
    override fun getColor(color: String): Color? {
        return when (color) {
            RED -> Red()
            GREEN -> Green()
            BLUE -> Blue()
            else -> null
        }
    }

    override fun getShape(shape: String): Shape? {
        return null
    }
}