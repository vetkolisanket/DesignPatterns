package structural.bridge

abstract class Shape(protected val drawAPI: DrawCircleAPI) {
    abstract fun draw()
}