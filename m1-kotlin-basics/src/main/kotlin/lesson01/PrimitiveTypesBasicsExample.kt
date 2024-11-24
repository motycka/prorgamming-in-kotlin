package lesson01

fun main() {
    val isTruthy: Boolean = true
    val index: Byte = 127
    val smallNumber: Short = 32767
    val number: Int = 2147483647
    val bigNumber: Long = 9223372036854775807L // notice L at the end
    val decimalNumber: Float = 123.12346f // notice f at the end
    val preciseNumber: Double = 123.12345886230469
    val character: Char = 'a'

    println("boolean: $isTruthy")
    println("byte: $index")
    println("short: $smallNumber")
    println("int: $number")
    println("long: $bigNumber")
    println("float: $decimalNumber")
    println("double: $preciseNumber")
    println("char: $character")
}
