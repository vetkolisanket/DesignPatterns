package behavioral.observer

class HexaObserver(observable: Observable): Observer(observable) {
    override fun update() {
        println("Hexa String: ${Integer.toHexString(observable.state)}")
    }
}