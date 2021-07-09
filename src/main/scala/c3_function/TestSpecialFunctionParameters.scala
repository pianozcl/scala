package c3_function

object TestSpecialFunctionParameters {
  def main(args: Array[String]): Unit = {

    //strs实际上是一个集合类型
    def f1(strs: String*): Unit = {
      println(strs + " ")
    }

    f1("alice")
    f1("alice", "bob")  //WrappedArray(alice, bob)


    //可变参数放在最后
    def f2(str1: String, str2: String*): Unit = {
      println("str1" + str1 + "str2" + str2)
    }
    f2("a", "b", "c", "d")

    //设置参数默认值
    def f3(str: String = "default"): Unit = {
      println(str)
    }
    f3()

    //带名参数
    def f4(name: String, age: Int): Unit ={
      println(s"${name}----${age}")
    }
    f4("alice", 44)
    f4( age = 22, name = "111")
  }
}
