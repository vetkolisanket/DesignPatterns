package behavioral.null_object

class NullCustomer: AbstractCustomer() {
    override fun isNil(): Boolean {
        return true
    }

    override fun name(): String {
        return "Not Available in Customer Database"
    }
}