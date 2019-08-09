package behavioral.command

class Broker {

    private val orders: MutableList<Order> by lazy { mutableListOf<Order>() }

    fun takeOrder(order: Order) {
        orders.add(order)
    }

    fun placeOrders() {
        orders.apply {
            forEach { it.execute() }
            clear()
        }
    }

}