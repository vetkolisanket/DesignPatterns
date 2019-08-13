package behavioral.observer

class Observable {

    private val observers by lazy { mutableListOf<Observer>() }
    var state: Int = 0
        set(value) {
            field = value
            notifyObservers()
        }

    fun add(observer: Observer) {
        observers.add(observer)
    }

    fun remove(observer: Observer) {
        observers.remove(observer)
    }

    private fun notifyObservers() {
        for (observer in observers) {
            observer.update()
        }
    }

}