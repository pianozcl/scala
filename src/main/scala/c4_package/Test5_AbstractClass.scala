package c4_package

object Test5_AbstractClass {
  def main(args: Array[String]): Unit = {

  }
}

//定义抽象类
abstract class Person {
  //定义非抽象属性
  val name: String = "person"
  var name2: String = "person2"

  //抽象属性
  var age: Int

  //非抽象的方法
  def eat(): Unit = {
    println("person eat")
  }

  //抽象方法
  def sleep()
}

class Student2 extends Person {
  //实现抽象属性和方法
  override var age: Int = 18


  override def sleep(): Unit = {
    println("sleep in class")
  }

  //重写非抽象的属性和方法
  override val name: String = "student"
  name2 = "hahaha"

}
