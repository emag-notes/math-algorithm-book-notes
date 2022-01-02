package ch02

import java.util.Scanner
import scala.collection.mutable.ArrayBuffer

object Chapter02_003 {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val N = sc.nextInt()
    var result = 0
    (1 to N).foreach { _ =>
      result = result + sc.nextInt()
    }
    println(result)
  }
}
