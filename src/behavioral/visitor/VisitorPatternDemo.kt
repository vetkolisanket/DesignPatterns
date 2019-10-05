package behavioral.visitor

fun main() {
    val computer = Computer()
    computer.accept(ComputerPartDisplayVisitor())
}