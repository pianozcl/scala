package c4_package

import scala.beans.BeanProperty

object Test3_Class {
  def main(args: Array[String]): Unit = {
    val student = new Student
    println(student.age)
    println(student.sex)

    student.sex = "boy"
    println(student.sex)
  }
}


//定义一个类，不加修饰符，默认public
class Student {
  private val name: String = "alice"

  @BeanProperty //为了兼容Java，相当于Java中的getter setter
  var age: Int = 13
  var sex: String = _

}
