package c3_function

object HighOrderFunction {
  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      println("f调用")
      n + 1
    }
    val res = f(123)
    println(res)

    val f1: Int => Int = f
    val f2 = f _

    println(f1)   //函数的引用地址，函数也是一个对象
    println(f2)

    def fun(): Int = {
      1
    }

    val f3 = fun
    val f4 = fun _
    println(f3)
    println(f4)


    //函数作为参数传递
    def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    def add(a: Int, b: Int): Int = {
      a + b
    }

    println(dualEval(add, 1, 2))
    println(dualEval((a, b) => a + b, 1, 2))
  }
}
