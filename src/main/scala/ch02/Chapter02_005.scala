package ch02

import java.util.Scanner

object Chapter02_005 {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val N = sc.nextInt()
    var result = 0
    (1 to N).foreach { _ =>
      result = result + sc.nextInt()
    }
    println(result % 100)
  }
}
