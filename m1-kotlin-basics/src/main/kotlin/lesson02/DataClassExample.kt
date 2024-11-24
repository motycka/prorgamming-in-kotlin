package lesson02

import java.time.LocalDate

fun main() {
    // primary constructor call
    val javaCourse = UniversityCourseData("Java", LocalDate.parse("2024-02-19"), 15)

    // secondary constructor call
    val pythonCourse = UniversityCourseData("Python")

    /*
    This will print:
     UniversityCourseRecord(subject=Java, startDate=2024-02-19, lengthDays=15)

     because the data class has a default toString method
     */
    println(javaCourse)

    println(javaCourse.subject)
    println(javaCourse.startDate)
    println(javaCourse.lengthDays)
}


data class UniversityCourseData(
    val subject: String?,
    val startDate: LocalDate,
    val lengthDays: Int
) {
    // alternative (secondary) constructor
    constructor(subject: String?) : this(subject, LocalDate.now(), 1)
}
