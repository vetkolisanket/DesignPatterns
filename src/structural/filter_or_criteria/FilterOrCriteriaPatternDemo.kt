package structural.filter_or_criteria

const val MALE = "MALE"
const val FEMALE = "FEMALE"
const val SINGLE = "SINGLE"
const val MARRIED = "MARRIED"

fun main() {
    val persons = mutableListOf<Person>()

    persons.add(Person("Robert", MALE, SINGLE)) 
    persons.add(Person("John", MALE, MARRIED))
    persons.add(Person("Laura", FEMALE, MARRIED)) 
    persons.add(Person("Diana", FEMALE, SINGLE)) 
    persons.add(Person("Mike", MALE, SINGLE))
    persons.add(Person("Bobby", MALE, SINGLE))

    val male = CriteriaMale()
    val female = CriteriaFemale()
    val single = CriteriaSingle()
    val singleMale = AndCriteria(single, male)
    val singleOrFemale = OrCriteria(single, female)

    println("Males: ")
    printPersons(male.meetCriteria(persons))

    println("\nFemales: ")
    printPersons(female.meetCriteria(persons))

    println("\nSingle Males: ")
    printPersons(singleMale.meetCriteria(persons))

    println("\nSingle Or Females: ")
    printPersons(singleOrFemale.meetCriteria(persons))
}

fun printPersons(persons: List<Person>){
    persons.forEach {
        println(it)
    }
}