package architectural.business_delegate_pattern

class Client(private val businessService: BusinessDelegate) {
    fun doTask() {
        businessService.doTask()
    }
}