package structural.filter_or_criteria

data class Person(private val name: String, private val gender: String, private val maritalStatus: String){

    fun getName() = name
    fun getGender() = gender
    fun getMaritalStatus() = maritalStatus

}