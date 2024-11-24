package lesson01

fun main() {
    /*
    Integer types:
     */
    val index: Byte = 127
    val smallNumber: Short = 32767
    val number: Int = 2147483647
    val bigNumber: Long = 9223372036854775807L // notice L at the end

    println("Byte: $index")
    println("Short: $smallNumber")
    println("Int: $number")
    println("Long: $bigNumber")

    /*
    Unsigned types:
    */
    val uIndex: UByte = 255u // u indicates unsigned type
    val uSmallNumber: UShort = 65535u
    val uNumber: UInt = 4294967295u
    val uBigNumber: ULong = 18446744073709551615u

    println("UByte: $uIndex")
    println("UShort: $uSmallNumber")
    println("UInt: $uNumber")
    println("ULong: $uBigNumber")

    /*
    Floating point types:
     */
    val decimalNumber: Float = 123.12346f // f indicates float type
    val preciseNumber: Double = 123.12345886230469

    println("Float: $decimalNumber")
    println("Double: $preciseNumber")
}
