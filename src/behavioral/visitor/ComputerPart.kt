package behavioral.visitor

interface ComputerPart {
    fun accept(computerPartVisitor: ComputerPartVisitor)
}