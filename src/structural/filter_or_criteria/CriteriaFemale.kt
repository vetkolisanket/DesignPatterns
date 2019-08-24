package structural.filter_or_criteria

class CriteriaFemale: Criteria {
    override fun meetCriteria(persons: List<Person>): List<Person> {
        val femalePersons = mutableListOf<Person>()
        persons.forEach {
            if (it.getGender() == FEMALE) {
                femalePersons.add(it)
            }
        }
        return femalePersons
    }
}