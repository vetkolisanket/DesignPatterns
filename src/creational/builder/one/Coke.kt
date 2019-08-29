package creational.builder.one

class Coke: ColdDrink() {
    override fun name(): String {
        return "Coke"
    }

    override fun price(): Float {
        return 30F
    }
}