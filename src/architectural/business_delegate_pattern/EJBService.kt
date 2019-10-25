package architectural.business_delegate_pattern

class EJBService: BusinessService {
    override fun doProcessing() {
        println("Processing task by invoking EJB Service")
    }
}