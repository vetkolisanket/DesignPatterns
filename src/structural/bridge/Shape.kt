package structural.bridge

abstract class Shape(protected val drawAPI: DrawAPI) {
    abstract fun draw()
}