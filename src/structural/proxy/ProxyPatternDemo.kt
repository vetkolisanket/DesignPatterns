package structural.proxy

fun main() {
    val image = ProxyImage("test_10mb.jpg")
    image.display()
    println("")
    image.display()
}