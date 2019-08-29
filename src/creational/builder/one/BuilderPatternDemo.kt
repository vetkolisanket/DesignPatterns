package creational.builder.one

fun main() {
    val mealBuilder = MealBuilder()

    val vegMeal = mealBuilder.prepareVegMeal()
    println("Veg Meal")
    vegMeal.showItems()
    println("Total Cost: ${vegMeal.getCost()}")

    val nonVegMeal = mealBuilder.prepareNonVegMeal()
    println("\n\nNon-Veg Meal")
    nonVegMeal.showItems()
    println("Total Cost: ${nonVegMeal.getCost()}")
}