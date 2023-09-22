package com.example.even

fun main() {
    println(calculateBMI(40.5,67.7))
}

fun calculateBMI(weight: Double, height: Double): Double {
    if (weight <= 0 || height <= 0) {
        throw IllegalArgumentException("Weight and height must be positive.")
    }
    return weight / (height * height)
}
