package c2_variable

import scala.util.control.Breaks

object TestFor {
  def main(args: Array[String]): Unit = {

    //范围遍历。本质是0是一个对象，调用了to方法
    println("范围遍历,包含最后一个元素。本质是0是一个对象，调用了to方法")
    for (i <- 0 to 10) {
      print(i + " ")
    }

    println()
    for (i <- 0.to(10)) {
      print(i + " ")
    }

    println()
    println("范围遍历，不包含最后一个元素")
    for (i <- Range(0, 10)) {
      print(i + " ")
    }

    println()
    for (i <- 0 until 10) {
      print(i + " ")
    }


    println()
    println("集合遍历")
    for (i <- Array(1,2,2,2,2,3,3,4,1)) {
      print(i + " ")
    }

    println()
    for (i <- List(1,2,2,2,2,3,3,4,1)) {
      print(i + " ")
    }

    println()
    println("循环守卫")
    //循环守卫，类似Java中的continue
    for (i <- 0 to 10 if i != 2) {
      print(i + " ")
    }

    println()
    println("循环步长")
    for (i <- 0 to 10 by 2) {
      print(i + " ")
    }
    println()
    for (i <- (0 to 10).by(2)) {
      print(i + " ")
    }
    println()
    for (i <- 30 to 0 by -2) {
      print(i + " ")
    }

    //打印等腰三角形
    println()
    printTower(9)

    //退出循环（Java的break功能，采用抛异常的方式实现，不推荐）
    try {
      for (i <- 0 to 10) {
        if (i == 3) {
          throw new Exception
        }
      }
    } catch {
      case e:Exception =>  print("什么都不做")//什么都不做
    }

    //scala的退出循环
    Breaks.breakable(
        for (i <- 0 to 10) {
          if (i == 3) {
            Breaks.break()
          }
        }
    )
  }

  def printTower(int: Int): Unit = {
    var blank = int
    var star = 1
    for (i <- 1 to int) {
      print(" " * blank)
      println("*" * star)
      star += 2
      blank -= 1
    }
  }
}
