package behavioral.null_object

abstract class AbstractCustomer {
    protected open lateinit var name: String

    abstract fun isNil(): Boolean

    abstract fun name(): String
}