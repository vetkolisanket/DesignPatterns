package structural.composite

fun main() {
    val CEO = Employee("John", "CEO", 30000)
    val headSales = Employee("Robert", "Head Sales", 20000)
    val headMarketing = Employee("Michel", "Head Marketing", 20000)
    val clerk1 = Employee("Laura", "Marketing", 10000)
    val clerk2 = Employee("Bob", "Marketing", 10000)
    val salesExecutive1 = Employee("Richard", "Sales", 10000)
    val salesExecutive2 = Employee("Rob", "Sales", 10000)

    CEO.add(headSales)
    CEO.add(headMarketing)

    headSales.add(salesExecutive1)
    headSales.add(salesExecutive2)

    headMarketing.add(clerk1)
    headMarketing.add(clerk2)

//    println(CEO)
//    CEO.subordinates.fold(mutableListOf(CEO)){ allEmployees, employee -> allEmployees.add(employee)}
    /*CEO.subordinates.forEach {
        println(it)
        it.subordinates.forEach {
            println(it)
        }
    }*/
    printEmployees(CEO)
}

fun printEmployees(employee: Employee) {
    println(employee)
    employee.subordinates.forEach {
        printEmployees(it)
    }
}