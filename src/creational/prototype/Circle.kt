package creational.prototype

class Circle: Shape() {

    init {
        type = CIRCLE
    }

    override fun draw() {
        println("Inside Circle::draw() method.")
    }
}