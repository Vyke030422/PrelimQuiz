package com.example.even

fun convertCurrency(
    amount: Double,
    fromCurrency: String,
    toCurrency: String,
    exchangeRate: Double
): Double {
    if (amount < 0) {
        throw IllegalArgumentException("Amount must be a non-negative value.")
    }

    if (exchangeRate <= 0) {
        throw IllegalArgumentException("Exchange rate must be a positive value.")
    }

    return amount * exchangeRate
}

fun main() {
    val amountInUSD = 100.0 // The amount in the source currency (USD in this case)
    val exchangeRate = 56.85 // Fixed exchange rate (e.g., 1 USD to 1.23 EUR)

    val amountInEUR = convertCurrency(amountInUSD, "USD", "PHP", exchangeRate)

    println("$amountInUSD USD is equivalent to $amountInEUR PHP")
}

