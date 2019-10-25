package architectural.business_delegate_pattern

class BusinessDelegate {
    private val lookupService = BusinessLookup()
    private lateinit var businessService: BusinessService
    private lateinit var serviceType: String

    fun setServiceType(serviceType: String) {
        this.serviceType = serviceType
    }

    fun doTask() {
        businessService = lookupService.getBusinessService(serviceType)
        businessService.doProcessing()
    }
}