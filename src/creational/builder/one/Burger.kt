package creational.builder.one

abstract class Burger : Item {
    override fun packing(): Packing {
        return Wrapper()
    }
}