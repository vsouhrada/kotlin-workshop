package com.github.vsouhrada.kotlin.workshop.demo

/**
 * @author vsouhrada
 */

fun topLevel(greetings: String) {
  println("Functions can be top-level")
  println("There is string interpolation in Kotlin: $greetings")
}





fun defaultAndOptionalParameters(p1: String, p2: Int, p3: String = "Default") {
  println("${p1.length} $p2 $p3")
}





fun paramNaming(name: String, count: Int) {
  defaultAndOptionalParameters(p2 = count, p1 = name)
}


// Single Expression
fun sum(a: Int, b: Int) = a + b


fun multipleParams(vararg parameters: String) {}



// Lambdas
fun higherLevelFunction(func: (Int, Int) -> Int) { // aka strategy pattern
  println(func(20, 30))
}


fun main(args: Array<String>) {
  higherLevelFunction { x, y -> x - y  }

  extensionFunction { name = "Vaclav Souhrada" }

  apply(2, {x -> x + 5})

  println(apply2(5) { x -> x + 5})
}


data class Presenter(var name: String)


fun extensionFunction(func: Presenter.() -> Unit) {
  println(func)
}


fun apply(i: Int, func: (Int) -> Int) {
  println(func(i))
}


fun apply2(i: Int, func: (Int) -> Int) = func(i)