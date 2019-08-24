package structural.filter_or_criteria

class OrCriteria(private val criteria: Criteria, private val otherCriteria: Criteria): Criteria {
    override fun meetCriteria(persons: List<Person>): List<Person> {
        val firstCriteriaPersons = criteria.meetCriteria(persons)
        val secondCriteriaPersons = otherCriteria.meetCriteria(persons)
        return firstCriteriaPersons.union(secondCriteriaPersons).toList()
    }
}