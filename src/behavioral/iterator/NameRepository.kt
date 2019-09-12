package behavioral.iterator

class NameRepository: Container {

    val names = arrayOf("Robert", "John", "Julie", "Laura")

    override fun getIterator(): Iterator {
        return NameIterator()
    }


    inner class NameIterator: Iterator {

        var index: Int = 0

        override fun hasNext(): Boolean {
            return index < names.size
        }

        override fun next(): Any? {
            if (this.hasNext()) {
                return names[index++]
            }
            return null
        }
    }

}