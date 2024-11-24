package lesson02

fun main() {
    println(getHoursInClass(Days.WEDNESDAY)) // prints 3
}

fun getHoursInClass(day: Days): Int {
    return when (day) {
        Days.MONDAY, Days.TUESDAY, Days.THURSDAY -> 4
        Days.WEDNESDAY, Days.FRIDAY -> 3
        Days.SATURDAY, Days.SUNDAY -> 0
    }
}

enum class Days(val isWorkDay: Boolean) {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false)
}
