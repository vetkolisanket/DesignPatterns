package architectural.mvc

class StudentController(
    val model: Student,
    val view: StudentView
) {

    fun setStudentName(name: String) {
        model.name = name
    }

    fun getStudentName() = model.name

    fun setStudentRollNo(rollNo: String) {
        model.rollNo = rollNo
    }

    fun getStudentRollNo() = model.rollNo

    fun updateView() {
        view.printStudentDetails(model.name, model.rollNo)
    }

}