package behavioral.command

class Stock(val name: String, val quantity: Int) {

    fun buy() {
        println("Stock [ Name: $name, Quantity: $quantity ] bought")
    }

    fun sell() {
        println("Stock [ Name: $name, Quantity: $quantity ] sold")
    }

}