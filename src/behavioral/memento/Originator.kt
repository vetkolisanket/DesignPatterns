package behavioral.memento

class Originator {
    lateinit var state: String

    fun saveStateToMemento(): Memento {
        return Memento(state)
    }

    fun getStateFromMemento(memento: Memento) {
        state = memento.getState()
    }
}