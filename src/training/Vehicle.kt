package training

abstract class Vehicle(val name: String, protected val durationInMinute: Int) {

    fun showDuration(): Int {
        return durationInMinute
    }
}