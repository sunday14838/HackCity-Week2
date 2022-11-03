package com.example.hackcityweek2

fun main() {

    var first = 96
    var second = 27

    println("Before swap")
    println("First number = $first")
    println("Second number = $second")

    val changedNumber = first

    first = second
    second = changedNumber

    println("After swap")
    println("First number = $first")
    println("Second number = $second")
}