package behavioral.memento

class Memento(private val state: String) {
    fun getState(): String {
        return state
    }
}