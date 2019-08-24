package structural.filter_or_criteria

interface Criteria {
    fun meetCriteria(persons: List<Person>): List<Person>
}