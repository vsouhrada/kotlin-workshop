package com.github.vsouhrada.kotlin.workshop.demo

/**
 * @author vsouhrada
 */

fun main(args: Array<String>) {
  /**
   * higher-order functions, lambda expressions, operator overloading, lazy evaluation and lots of useful methods to work with collections.
   */

  val numbers = arrayListOf(10 ,5 , -9, 9, 11, 5, -6)
  val nonNegative = numbers.filter { it >= 0}

  println(nonNegative)

  println(numbers.take(2))  // First two elements: [10, 5]

  println(numbers.drop(2))  // List without first two elements: [-9, 9, 11, 5, -6]

  println(numbers.foldRight(0, { a, b -> a + b }))  // Sum of all elements: 25

  numbers.forEach { println("${it * 2} ") }  //20 10 -18 18 22 10 -12

  val kindOfNumbers: Iterable<String> = numbers.filter { it < 0 }.map { "$it is negative" }
  println(kindOfNumbers)

  }