package structural.decorator

open class ShapeDecorator(private val decoratedShape: Shape): Shape {
    override fun draw() {
        decoratedShape.draw()
    }
}