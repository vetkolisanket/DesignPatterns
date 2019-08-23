package structural.decorator

class RedShapeDecorator(private val decoratedShape: Shape): ShapeDecorator(decoratedShape) {

    override fun draw() {
        super.draw()
        setRedBorder()
    }

    fun setRedBorder() {
        println(" with red border")
    }

}