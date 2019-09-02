package creational.prototype

class Rectangle: Shape() {

    init {
        type = RECTANGLE
    }

    override fun draw() {
        println("Inside Rectangle::draw() method.")
    }
}