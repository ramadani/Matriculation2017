package training

import java.text.SimpleDateFormat
import java.util.*

class Training(val date: Date, private val vehicle: Vehicle) {

    fun history() {
        val dateFormat = SimpleDateFormat("dd-MM-yyyy hh:mm").format(date)
        println("Pergi training pada $dateFormat menggunakan ${vehicle.name}")
    }
}