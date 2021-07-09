package c2_variable

object TestIfElse {
  def main(args: Array[String]): Unit = {
    if (true) {
      println("true")
    } else {
      println("false")
    }


    val res: String = if (true) {
      "aaa"
    } else {
      "bbb"
    }

    println(res)

    val res2 =  if (true) "aaa" else "bbb"
    println(res2)
  }

}
