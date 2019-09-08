package structural.proxy

class RealImage(val fileName: String): Image {

    init {
        loadFromDisk()
    }

    override fun display() {
        println("Displaying $fileName")
    }

    private fun loadFromDisk() {
        println("Loading $fileName")
    }

}