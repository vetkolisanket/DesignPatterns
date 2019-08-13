package behavioral.observer

class OctalObserver(observable: Observable): Observer(observable) {
    override fun update() {
        println("Octal String: ${Integer.toOctalString(observable.state)}")
    }
}