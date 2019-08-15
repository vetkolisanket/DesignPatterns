package behavioral.strategy

class Context {

    private lateinit var strategy: Strategy

    fun setStrategy(strategy: Strategy) {
        this.strategy = strategy
    }

    fun performOperation(num1: Int, num2: Int) {
        println(strategy.doOperation(num1, num2))
    }

}