package structural.filter_or_criteria

class CriteriaSingle: Criteria {
    override fun meetCriteria(persons: List<Person>): List<Person> {
        val singlePersons = mutableListOf<Person>()
        persons.forEach {
            if (it.getMaritalStatus() == SINGLE) {
                singlePersons.add(it)
            }
        }
        return singlePersons
    }
}