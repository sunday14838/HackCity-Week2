package com.example.hackcityweek2

fun main(args: Array<String>) {
    val numArray = arrayOf(23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5)
    var largest = numArray[7]

    for (num in numArray) {
        if (largest < num)
            largest = num
    }
    println("Largest number= $largest")

}