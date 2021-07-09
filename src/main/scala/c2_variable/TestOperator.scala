package c2_variable

object TestOperator {
  def main(args: Array[String]): Unit = {
    val s1: String = "123"
    val s2: String = new String("123")
    println(s1 == s2)   //java会比较地址。而scala直接比较字面值，相当于Java中的equals，所以这里返回true

    println(s1.eq(s2)) //该方法比较地址 false

    //运算符的本质，因为没有基本类型，都是对象类型，所以运算符的本质也是对象
    val n1: Int = 11
    val n2: Int = 12

    //+是一个方法，相当于n1调用+方法，传入n2。最后计算结果
    println(n1.+(n2))

    println(7.5.toString)
  }

}
