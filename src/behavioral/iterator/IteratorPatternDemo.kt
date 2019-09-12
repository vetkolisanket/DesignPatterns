package behavioral.iterator

fun main() {
    val nameRepository = NameRepository()

    val iterator = nameRepository.getIterator()
    while (iterator.hasNext()) {
        val name = iterator.next() as String
        println("Name : $name")
    }
}