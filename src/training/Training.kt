package training

import java.text.SimpleDateFormat
import java.util.*

class Training(
        private val person: Person,
        private val date: Date,
        private val vehicle: Vehicle
) {

    fun history() {
        val dateFormat = SimpleDateFormat("dd-MM-yyyy hh:mm").format(date)
        println("${person.name} go to training on $dateFormat using ${vehicle.name}")
    }
}