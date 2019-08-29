package creational.builder.one

abstract class ColdDrink : Item {

    override fun packing(): Packing {
        return Bottle()
    }

}