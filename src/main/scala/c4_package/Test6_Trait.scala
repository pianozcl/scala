package c4_package

object Test6_Trait {
  def main(args: Array[String]): Unit = {
    val student = new Student6
    student.say()
  }
}


//父类
class Person6 {
  val name = "hahha"
  var age = 13
  def say(): Unit = {
    println("name")
  }
}

//定义一个特质
trait Young {
  //声明抽象和非抽象属性
  var age: Int
  val name: String = "young"


  //声明非抽象方法
  def play(): Unit = {
    println("young play")
  }

  //声明抽象方法
  def eat()
}

class Student6 extends Person6 with Young {
  //需要重写冲突的属性

  override val name: String = "student"

  override def eat(): Unit = {
    println(s"${name}")
  }

  def study(): Unit = {
    println("studying")
  }

  override def say(): Unit = {
    super.say()
  }
}
