package creational.builder.one

class Pepsi: ColdDrink() {
    override fun name(): String {
        return "Pepsi"
    }

    override fun price(): Float {
        return 35F
    }
}