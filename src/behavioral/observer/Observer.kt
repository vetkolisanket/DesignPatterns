package behavioral.observer

abstract class Observer(protected val observable: Observable) {

    init {
        observable.add(this)
    }

    abstract fun update()

}