package architectural.business_delegate_pattern

const val EJB = "EJB"
const val JMS = "JMS"

fun main() {
    val businessDelegate = BusinessDelegate()
    businessDelegate.setServiceType(EJB)
    val client = Client(businessDelegate)
    client.doTask()
    businessDelegate.setServiceType(JMS)
    client.doTask()
}