package creational.abstract_factory

object FactoryProducer {
    fun getFactory(type: String): AbstractFactory? {
        return when (type) {
            SHAPE -> ShapeFactory()
            COLOR -> ColorFactory()
            else -> null
        }
    }
}