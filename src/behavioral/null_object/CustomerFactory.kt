package behavioral.null_object

class CustomerFactory {
    companion object {
        val names = listOf("Rob", "Joe", "Julie")

        fun getCustomer(name: String): AbstractCustomer {
            if (names.contains(name)) {
                return RealCustomer(name)
            }
            return NullCustomer()
        }
    }
}