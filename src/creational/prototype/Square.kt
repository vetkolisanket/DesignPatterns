package creational.prototype

class Square: Shape() {

    init {
        type = SQUARE
    }

    override fun draw() {
        println("Inside Square::draw() method.")
    }
}