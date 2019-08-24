package structural.filter_or_criteria

class CriteriaMale: Criteria {
    override fun meetCriteria(persons: List<Person>): List<Person> {
        val malePersons = mutableListOf<Person>()
        persons.forEach {
            if (it.getGender() == MALE) {
                malePersons.add(it)
            }
        }
        return malePersons
    }
}