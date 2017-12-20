package training

import java.text.SimpleDateFormat
import kotlin.collections.ArrayList

class Person(private val name: String) {

    var bodyTemperature: Int = 36
    var isSick: Boolean = bodyTemperature > 37
    private var trainings: ArrayList<Training> = arrayListOf()

    companion object {
        fun main(args: Array<String>) {
            val person = Person("Dani")

            person.bodyTemperature = 38
            person.goTraining()
            person.printTrainingHistory()
            person.resetTrainingHistory()
        }
    }

    fun goTraining() {
        if (isSick) {
            val date1 = SimpleDateFormat("yyyy-MM-dd hh:mm").parse("2018-03-01 06:00")
            val date2 = SimpleDateFormat("yyyy-MM-dd hh:mm").parse("2018-03-01 07:00")
            trainings.add(Training(date1, Car()))
            trainings.add(Training(date2, Motocycle()))
        } else {
            val date3 = SimpleDateFormat("yyyy-MM-dd hh:mm").parse("2018-03-01 07:30")
            trainings.add(Training(date3, Ojek()))
        }
    }

    fun printTrainingHistory() {
        trainings.forEach(Training::history)
    }

    fun resetTrainingHistory() {
        trainings.clear()
    }
}
