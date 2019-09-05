package structural.flyweight

class Circle(private val color: String): Shape {

    private var x: Int = 0
    private var y: Int = 0
    private var radius: Int = 0

    fun setX(x: Int) {
        this.x = x
    }

    fun setY(y: Int){
        this.y = y
    }

    fun setRadius(radius: Int) {
        this.radius = radius
    }

    override fun draw() {
        println("Circle: draw() [Color: $color, x: $x, y: $y, radius: $radius]")
    }
}