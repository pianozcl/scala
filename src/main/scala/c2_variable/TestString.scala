package c2_variable

object TestString {
  def main(args: Array[String]): Unit = {
    val name: String = "alice"
    val age: Int = 11
    println(name + age)
    println(name * 3) //相当于三个alice相加拼接而成的字符串

    printf("hahaha%d%s", age, name)

    //模版语法
    println(s"${name}hahahahaha----${age}") //hahaha11alicealicehahahahaha----11

    val num = 3.12345
    println(f"${num}%5.2f") //长度不够5前面补空格，2代表小数点保留两位 3.12
    println(raw"${num}%5.2f") //3.12345%5.2f

    //三引号，保持原格式输出
    val sql =
      """
        |select
        |*
        |from
        |user
      """.stripMargin
    println(sql)
  }
}
