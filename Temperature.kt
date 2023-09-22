package com.example.even

fun convertTemperature(
    value: Double,
    fromUnit: String,
    toUnit: String
): Double {
    val temperatureUnits = mapOf(
        "Fahrenheit" to { it: Double -> (it - 32) * 5 / 9 },
        "Celsius" to { it: Double -> it },
        "Kelvin" to { it: Double -> it + 273.15 }
    )

    val convertToCelsius = temperatureUnits[fromUnit]
        ?: throw IllegalArgumentException("Unsupported source temperature unit: $fromUnit")
    val convertToTargetUnit = temperatureUnits[toUnit]
        ?: throw IllegalArgumentException("Unsupported target temperature unit: $toUnit")

    return convertToTargetUnit(convertToCelsius(value))
}

fun main() {
    val temperature = 32.0
    val fromUnit = "Fahrenheit"
    val toUnit = "Celsius"

    val convertedTemperature = convertTemperature(temperature, fromUnit, toUnit)

    println("$temperature $fromUnit is equivalent to $convertedTemperature $toUnit")
}
