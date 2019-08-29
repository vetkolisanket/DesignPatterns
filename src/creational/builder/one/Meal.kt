package creational.builder.one

import kotlin.math.cos

class Meal {

    val items by lazy { mutableListOf<Item>() }

    fun addItem(item: Item) {
        items.add(item)
    }

    fun getCost(): Float {
        var cost = 0F
        items.forEach {
            cost += it.price()
        }
        return cost
    }

    fun showItems() {
        items.forEach {
            print("Item : ${it.name()}")
            print(", Packing : ${it.packing().pack()}")
            println(", Price : ${it.price()}")
        }
    }

}