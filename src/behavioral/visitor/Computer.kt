package behavioral.visitor

class Computer: ComputerPart {

    private val parts: Array<ComputerPart> = arrayOf(Mouse(), Keyboard(), Monitor())

    override fun accept(computerPartVisitor: ComputerPartVisitor) {
        parts.forEach {
            it.accept(computerPartVisitor)
        }
        computerPartVisitor.visit(this)
    }
}