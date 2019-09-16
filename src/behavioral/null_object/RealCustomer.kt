package behavioral.null_object

class RealCustomer(override var name: String): AbstractCustomer() {
    override fun isNil(): Boolean {
        return false
    }

    override fun name(): String {
        return name
    }
}