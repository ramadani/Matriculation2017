package training

class Person(private val name: String) {

    var bodyTemperature: Int = 36
    var isSick: Boolean = bodyTemperature > 37

    companion object {
        fun main(args: Array<String>) {
            val person = Person("Dani")
        }
    }

    fun goTraining() {

    }

    fun printTrainingHistory() {

    }

    fun resetTrainingHistory() {

    }
}
