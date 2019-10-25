package architectural.business_delegate_pattern

class JMSService: BusinessService {
    override fun doProcessing() {
        println("Processing task by invoking JMS Service")
    }
}