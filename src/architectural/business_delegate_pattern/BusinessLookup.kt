package architectural.business_delegate_pattern

class BusinessLookup {
    fun getBusinessService(serviceType: String): BusinessService {
        if (serviceType == EJB) {
            return EJBService()
        } else {
            return JMSService()
        }
    }
}