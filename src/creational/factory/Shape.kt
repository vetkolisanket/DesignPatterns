package creational.factory

interface Shape {

    companion object {
        const val RECTANGLE = "RECTANGLE"
        const val SQUARE = "SQUARE"
        const val CIRCLE = "CIRCLE"
    }

    fun draw()

}