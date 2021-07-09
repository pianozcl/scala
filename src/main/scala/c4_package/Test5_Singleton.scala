package c4_package

object Test5_Singleton {
  def main(args: Array[String]): Unit = {
    val student1 = Student3.getInstance()
    val student2 = Student3.getInstance()

    println(student1) //单例，获取多次引用一样
    println(student2)
  }
}


class Student3 private(val name: String, val age: Int) {
  def printInfo(): Unit = {
    println("ssss")
  }
}

////单例模式，饿汉
//object Student3 {
//  private val student: Student3 = new Student3("zcl", 11)
//  def getInstance(): Student3 = student
//}

//单例模式，懒汉
object Student3 {
  private var student: Student3 = _
  def getInstance(): Student3 = {
    if (student == null) {
      student = new Student3("hahaha", 333)
      student
    } else {
      student
    }
  }
}