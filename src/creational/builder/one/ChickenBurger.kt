package creational.builder.one

class ChickenBurger: Burger() {
    override fun name(): String {
        return "Chicken Burger"
    }

    override fun price(): Float {
        return 50.5F
    }
}