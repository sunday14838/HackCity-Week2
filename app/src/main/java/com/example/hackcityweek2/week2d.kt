package com.example.hackcityweek2

fun main(args: Array<String>) {
    val numArray = arrayOf(45.3, 67.5, -45.6, 20.34, 33.0, 45.6)
    var sum =0.0

    for (num in numArray) {
        sum += num
    }
    val average = sum / numArray.size
    println("The average = ${average.toFloat()}")
}