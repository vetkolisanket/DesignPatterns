package structural.composite

data class Employee(private val name: String, private val role: String, private val salary: Int) {
    val subordinates  = mutableListOf<Employee>()

    fun add(employee: Employee) {
        subordinates.add(employee)
    }

    fun remove(employee: Employee) {
        subordinates.remove(employee)
    }

}