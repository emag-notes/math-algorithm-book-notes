package ch02

import java.util.Scanner

object Chapter02_008 {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val N = sc.nextInt()
    val S = sc.nextInt()

    var cnt = 0
    (1 to N).foreach { i =>
      (1 to N).foreach { j =>
        if (i + j <= S) cnt += 1
      }
    }
    println(cnt)
  }
}
