package ch02

import java.util.Scanner

object D2b {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    var decimal = sc.nextInt()
    var binary = ""
    while (decimal > 0) {
      decimal match {
        case _ if decimal % 2  == 0 => binary = "0" + binary
        case _ if decimal % 2  == 1 => binary = "1" + binary
      }
      decimal = decimal / 2
    }
    println(binary)
  }
}
