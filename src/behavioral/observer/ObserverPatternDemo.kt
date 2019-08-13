package behavioral.observer

fun main() {
    val observable = Observable()

    val hexaObserver = HexaObserver(observable)
    val octalObserver = OctalObserver(observable)
    val binaryObserver = BinaryObserver(observable)

    println("First state change is: 15")
    observable.state = 15

    println("Second state change is: 10")
    observable.state = 10
}