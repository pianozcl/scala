package c3_function

object SimplifyFunction {
  def main(args: Array[String]): Unit = {
    def f0(name: String): String = {
      return name
    }

    //return可以省略，scala会以最后一行作为返回值
    def f1(name: String): String = {
      name
    }

    //函数体只有一行代码，可以省略花括号
    def f2(name: String): String = name


    //返回值能推断出来，可以省略返回值
    def f3(name: String) = name

    //如果有return，则返回值必须指定
    def f4(name: String): String = {
      return name
    }

    def f5(name: String): Unit = {
      return name
    }

    println(f5("alice"))

    //无返回值类型，可以省略=
    def f6(name: String) {
      println(name)
    }

    //没有参数，调用时可以省略（）
    def f7() {
      println("alice7")
    }

    f7

    //声名可以不加（），调用的时候也不能加（）
    def f8 {
      println("alice8")
    }
    //f8();报错

    //匿名函数,lambda
    (name: String) => {
      println(name)
    }
  }
}
