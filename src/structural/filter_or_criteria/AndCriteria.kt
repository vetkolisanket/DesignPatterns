package structural.filter_or_criteria

class AndCriteria(private val criteria: Criteria, private val otherCriteria: Criteria): Criteria {
    override fun meetCriteria(persons: List<Person>): List<Person> {
        val firstCriteriaPersons = criteria.meetCriteria(persons)
        return otherCriteria.meetCriteria(firstCriteriaPersons)
    }
}