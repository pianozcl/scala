package c2_variable

import scala.io.StdIn

object TestStdIn {
  def main(args: Array[String]): Unit = {
    println("please input the message")
    val str = StdIn.readLine()

    println("please input the age")
    val age = StdIn.readInt()

    println(s"${str}${age}")
  }
}
