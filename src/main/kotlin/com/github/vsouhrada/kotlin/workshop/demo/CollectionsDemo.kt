package com.github.vsouhrada.kotlin.workshop.demo

/**
 * @author vsouhrada
 */

fun main(args: Array<String>) {
  val pairs = listOf(Pair("bob", "UGLY"), Pair("sue", "PETTY"), Pair("bob", "FAT"))
  val result = pairs
          .groupBy { it.first }
          .mapValues { it.value.map { p -> p.second }.toSet() }
  println(result)
}

//fun main(args: Array<String>) {
//  val pairs = listOf(Pair("bob", "UGLY"), Pair("sue", "PETTY"), Pair("bob", "FAT"))
//  val result = pairs.toMutableList()
//          .mapInPlace { it.value.map { p -> p.second }.toList() }
//          .groupBy { it.first }
//  println(result)
//}

 fun <T> Array<T>.mapInPlace(mutator: (T)->T) {
  this.forEachIndexed { idx, value ->
    mutator(value).let { newValue ->
      if (newValue !== value) this[idx] = mutator(value)
    }
  }
}

inline fun <T> MutableList<T>.mapInPlace(mutator: (T)->T) {
  val iterate = this.listIterator()
  while (iterate.hasNext()) {
    val oldValue = iterate.next()
    val newValue = mutator(oldValue)
    if (newValue !== oldValue) {
      iterate.set(newValue)
    }
  }
}