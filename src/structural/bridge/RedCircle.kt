package structural.bridge

class RedCircle: DrawCircleAPI {
    override fun drawCircle(radius: Int, x: Int, y: Int) {
        println("Drawing Circle[color: red, radius: $radius, x: $x, y: $y]")
    }
}