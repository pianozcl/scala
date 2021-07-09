package c3_function

object Lambda {
  def main(args: Array[String]): Unit = {
    val fun = (name: String) => {
      println(name)
    }
    fun("hahaha")

    //以函数作为参数(以String为参数，Unit为返回的函数类型)
    def f(func: String => Unit): Unit = {
      func("zzzzz") //定死了数据，至于什么操作由传进来的函数决定
    }

    f(fun)
    f((name: String) => {
      println("将匿名函数作为参数传进来")
    })


    //匿名函数简化
    //参数类型自动推导
    f((name) => {
      println(name)
    })

    //只有一个参数，（）可以省略，只有一行代码{}可以省略
    f(name => println(name))

    //省略参数
    f(println(_))

    //可以推断出传入的println是一个函数，直接省略下划线
    f(println)


    //定义一个二元运算，具体操作通过参数传入
    def dualFunction(fun: (Int, Int) => Int): Int = {
      val res = fun(1, 2)
      println(res)
      return res
    }

    val add = (a: Int, b: Int) => a + b
    val minus = (a: Int, b: Int) => a - b
    dualFunction(add)
    dualFunction(minus)
    dualFunction((a, b) => a * b)
    dualFunction(_ * _)
  }
}
