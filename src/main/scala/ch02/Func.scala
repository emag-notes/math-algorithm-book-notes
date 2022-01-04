package ch02

object Func {
  var cnt = 1000

  def func1: Int = 2021

  def func2(pos: Int): Int = {
    cnt += 1
    cnt + pos
  }

  def main(args: Array[String]): Unit = {
    println(func1) // => 2021
    println(func2(500)) // => 1501
    println(func2(500)) // => 1502
  }
}
