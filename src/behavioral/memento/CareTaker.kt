package behavioral.memento

class CareTaker {
    private val mementoList = mutableListOf<Memento>()

    fun add(memento: Memento) {
        mementoList.add(memento)
    }

    fun get(index: Int): Memento {
        return mementoList[index]
    }

}