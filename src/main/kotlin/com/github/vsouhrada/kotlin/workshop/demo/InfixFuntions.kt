package com.github.vsouhrada.kotlin.workshop.demo

import java.time.LocalDate
import java.time.LocalDateTime


object today

object start


infix fun today.at(start: start) = currentTime()

infix fun LocalDateTime.startDay(today: today) = currentDate()

private fun currentDate() = LocalDate.now()

private fun currentTime() = LocalDateTime.now()

fun main(args: Array<String>) {
  println(today at start)

  println(LocalDateTime.now() startDay today)
}
