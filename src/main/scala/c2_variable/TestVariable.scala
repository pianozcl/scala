package c2_variable

import c1_helloworld.Student

object TestVariable {
  def main(args: Array[String]): Unit = {
    var a: Int = 10

    //自动推导类型
    var a1 = 10

    //强类型语言，不可改变类型
    //a1 = "a"

    //变量声明必须有初始值
    //var a2

    //val修饰的常量不可改变，var修饰的变量可以改变
    val a3 = 10
    a1 = 11
    //a3 = 11


    //var声明的引用可以改变指向，指向其他对象
    var alice = new Student("alice", 24)
    alice = new Student("Alice", 25)
    alice = null;

    //
    val bob = new Student("bob", 25)
    //bob = null; 错误，不能改变引用指向
    bob.age = 100   //正确，因为Student的age是用var声明的
    bob.printInfo()
  }
}
