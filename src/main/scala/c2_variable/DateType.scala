package c2_variable

import c1_helloworld.Student

object DateType {
  def main(args: Array[String]): Unit = {
    val a1: Byte = 127
    val a2: Byte = -128

    val a3: Int = 12

    val a4: Long = 1231231231231212312L


    val b: Byte = 10 + 20

    val b1: Byte = (a3 + 20).toByte
    println(b)


    val c: Float = 1.2345f
    val d: Double = 1.2345

    //特殊字符
    val c1: Char = '\n'
    val c2: Char = '\t'
    println("asdasd" + c1 + "asdasd")
    println("asdasd" + c2 + "asdasd")

    //ASCII
    val  i1: Int = c1
    println(i1)

    //boolean
    val isTure = true

    //空值
    def m1: Unit = {
      println("m1被调用")
    }
    val a = m1
    println(a)  //()

    //空引用。引用类型才能赋值为null
    var student: Student = new Student("zcl", 111);
    student = null

    //Nothing是所有类的子类
    def m2(int: Int): Nothing = {
      throw new Exception
    }

    //当一个方法返回不同类型，可以选择它们最近的公共父类作为返回值
    def m3(int: Int): Int = {
      if (int == 0) {
        throw new Exception
      } else {
        return 1
      }
    }
    val bb = m2(2)
    println(bb)

  }
}
