package behavioral.observer

class BinaryObserver(observable: Observable): Observer(observable) {
    override fun update() {
        println("Binary String: ${Integer.toBinaryString(observable.state)}")
    }
}