package lesson02

import java.time.LocalDate

fun main() {
    // primary constructor call
    val javaCourse = UniversityCourse("Java", LocalDate.parse("2024-02-19"), 15)

    // secondary constructor call
    val pythonCourse = UniversityCourse("Python")

    println(javaCourse)

    println(javaCourse.subject)
    println(javaCourse.startDate)
    println(javaCourse.lengthDays)

//    println("Course ${javaCourse.subject} starts ${javaCourse.startDate} and runs ${javaCourse.lengthDays} days")
//    println("Course ${pythonCourse.subject} starts ${pythonCourse.startDate} ans runs ${pythonCourse.lengthDays} days")
}

class UniversityCourse { // access modifier, class keyword, class name

    // class fields
    var subject: String // access modifier, data type, variable name
    val startDate: LocalDate
    val lengthDays: Int

    // primary constructor - access modifier, LocalDate startDate, name, arguments
    constructor(subject: String, startDate: LocalDate, lengthDays: Int) {
        // code that will be executed during class instantiation
        this.subject = subject
        this.startDate = startDate
        this.lengthDays = lengthDays
    }

    // secondary constructor
    constructor(subject: String) {
        this.subject = subject
        this.startDate = LocalDate.now()
        this.lengthDays = 1
    }
}
