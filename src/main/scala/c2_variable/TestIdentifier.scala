package c2_variable

object TestIdentifier {
  def main(args: Array[String]): Unit = {

    //以字母或者下划线开头
    val hello: String = "123"
    val _hello: String = "123"

    //var a-b: String = "123" //Error:(7, 10) not found: value-
    //val 123abc: String = "123"  error


    //以操作符开头,不能包含数字
    val !+-*/ = 10
    println(!+-*/)


    //反引号，可以定义任意字段，即使是关键字
    val `if` = 10
  }
}
