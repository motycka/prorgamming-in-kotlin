package lesson01

import java.util.*

fun main() {
    println("Printing to console with new line at the end")

    print("Printing to console without new line at the end")
    println() // just new line

    val name = "Moni"
    val greeting = "Hello $name!" // String concatenation
    println(greeting)

    var greeting2 = "Hola"
    greeting2 += " $name!" // Assignment addition String concatenation
    println(greeting2)

    val hello = "Hello"
    val formattedGreeting = String.format("%s %s!", hello, name) // String formatting
    println(formattedGreeting)

    val fullGreeting = "$hello $name" // String concatenation
    println(fullGreeting)

    val words = arrayOf("Greetings", "Monika")
    val joinedWords = java.lang.String.join(" ", *words) + "!" // Joining strings
    println(joinedWords)


    val text = "Banana, Apple, Orange, Kiwi, Mango, Pineapple, Watermelon, Strawberry"

    println("Length: " + text.length)

    val fruits = text.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
    for (fruit in fruits) {
        println(fruit.trim { it <= ' ' }) // trim to remove leading ot trailing space
    }

    println("Has apple: " + text.contains("Apple"))

    println(text.uppercase(Locale.getDefault()))

    println(text.lowercase(Locale.getDefault()))

    println(text.substring(10, 20))

    val newText = text.replace("Apple", "Peach")
    println(newText)
}
