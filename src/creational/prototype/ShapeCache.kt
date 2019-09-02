package creational.prototype

object ShapeCache {

    val shapeMap = hashMapOf<String, Shape>()

    fun getShape(shapeId: String): Shape {
        val cachedShape = shapeMap[shapeId]
        return cachedShape!!.clone() as Shape
    }

    //For each shape run database query and create shape shapeMap.put(shapeKey, shape) for e.g. we are adding 3 shapes
    fun loadCache() {
        val circle = Circle()
        circle.id = "1"
        shapeMap[circle.id] = circle

        val square = Square()
        square.id = "2"
        shapeMap[square.id] = square

        val rectangle = Rectangle()
        rectangle.id = "3"
        shapeMap[rectangle.id] = rectangle
    }

}