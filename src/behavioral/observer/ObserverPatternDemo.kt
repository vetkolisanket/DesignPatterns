package behavioral.observer

fun main() {
    val observable = Observable()

    HexaObserver(observable)
    OctalObserver(observable)
    BinaryObserver(observable)

    println("First state change is: 15")
    observable.state = 15

    println("Second state change is: 10")
    observable.state = 10
}