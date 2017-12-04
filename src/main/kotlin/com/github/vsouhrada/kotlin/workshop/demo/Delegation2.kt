package com.vsouhrada.kotlin.playground.delegation

/**
 * @author vsouhrada
 */

interface Base {

  fun println()

}

class BaseImpl(val x: Int) : Base {

  override fun println() {
    println(x)
  }

}

class Derived(b: Base) : Base by b

fun main(args: Array<String>) {
  val b = BaseImpl(10)
  Derived(b).println() // prints 10
}