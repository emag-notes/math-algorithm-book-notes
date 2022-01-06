package ch02

import java.util.Scanner

object Chapter02_007 {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val N = sc.nextInt()
    val X = sc.nextInt()
    val Y = sc.nextInt()

    var cnt = 0
    (1 to N).foreach { i =>
      if (i % X == 0 || i % Y == 0) cnt += 1
    }
    println(cnt)
  }
}
