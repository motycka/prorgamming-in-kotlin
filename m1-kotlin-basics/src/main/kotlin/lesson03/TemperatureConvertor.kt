package lesson03

import mu.KLogging

object TemperatureConverter: KLogging() {

    /**
     * Converts temperature value given in Fahrenheit to Celsius
     *
     * @param fahrenheit temperature value in Fahrenheit
     * @return temperature value in Celsius
     * @see [Fahrenheit](https://en.wikipedia.org/wiki/Fahrenheit)
     * @see [Celsius](https://en.wikipedia.org/wiki/Celsius)
     */
    fun toCelsius(fahrenheit: Double): Double {
        logger.info("Converting $fahrenheit Fahrenheit to Celsius")
        return (fahrenheit - 32) * 5 / 9
    }

    /**
     * Converts temperature value given in Celsius to Fahrenheit
     *
     * @param celsius temperature value in Celsius
     * @return temperature value in Fahrenheit
     * @see [Fahrenheit](https://en.wikipedia.org/wiki/Fahrenheit)
     * @see [Celsius](https://en.wikipedia.org/wiki/Celsius)
     */
    fun toFahrenheit(celsius: Double): Double {
        logger.info("Converting $celsius Celsius to Fahrenheit")
        return celsius * 9 / 5 + 32
    }

}
