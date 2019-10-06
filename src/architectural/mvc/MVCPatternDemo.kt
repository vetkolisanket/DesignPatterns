package architectural.mvc

fun retrieveStudentFromDatabase() = Student("Robert", "10")

fun main() {
    val model = retrieveStudentFromDatabase()
    val view = StudentView()
    val controller = StudentController(model, view)

    controller.updateView()
    controller.setStudentName("John")
    controller.updateView()
}