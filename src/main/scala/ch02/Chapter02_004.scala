package ch02

import java.util.Scanner

object Chapter02_004 {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val in1 = sc.nextInt()
    val in2 = sc.nextInt()
    val in3 = sc.nextInt()
    println(in1 * in2 * in3)
  }
}
