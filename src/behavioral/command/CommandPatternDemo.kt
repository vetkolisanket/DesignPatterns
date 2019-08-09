package behavioral.command

fun main() {
    val stock = Stock("ABC", 10)

    val buyStockOrder = BuyStock(stock)
    val sellStockOrder = SellStock(stock)

    val broker = Broker()

    broker.apply {
        takeOrder(buyStockOrder)
        takeOrder(sellStockOrder)
        placeOrders()
    }

}