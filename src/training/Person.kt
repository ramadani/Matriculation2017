package training

import java.text.SimpleDateFormat
import kotlin.collections.ArrayList

class Person(val name: String) {

    var bodyTemperature: Int = 36
    private var trainings: ArrayList<Training> = arrayListOf()

    val isSick: Boolean
        get() = bodyTemperature > TEMPERATURE_OF_SICK

    companion object {
        val TEMPERATURE_OF_SICK = 37

        fun main(args: Array<String>) {
            with(Person("Dani")) {
                bodyTemperature = 34
                goTraining()
                printTrainingHistory()
                resetTrainingHistory()
            }
        }
    }

    fun goTraining() {
        if (!isSick) {
            val date1 = SimpleDateFormat("yyyy-MM-dd hh:mm").parse("2018-03-01 06:00")
            val date2 = SimpleDateFormat("yyyy-MM-dd hh:mm").parse("2018-03-02 07:00")
            trainings.add(Training(this, date1, Car()))
            trainings.add(Training(this, date2, Motorcycle()))
        } else {
            val date3 = SimpleDateFormat("yyyy-MM-dd hh:mm").parse("2018-03-03 07:30")
            trainings.add(Training(this, date3, Ojek()))
        }
    }

    fun printTrainingHistory() {
        trainings.forEach(Training::history)
    }

    fun resetTrainingHistory() {
        trainings.clear()
    }
}
