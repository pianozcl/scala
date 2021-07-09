package c3_function

object ControllerAbstraction {
  def main(args: Array[String]): Unit = {

    def f0(): Int = {
      println("f0")
      12
    }


    /**
      * 传名函数，传递的不是具体的值，而是代码块。此例传递一个返回Int的代码块
      * @param a
      */
    def f(a: => Int): Unit = {
      println("a " + a)
      println("a " + a)
    }

    f(22)
    f(f0()) //相当于把f0作为a传入f，所以会调用两次（跟a出现的次数有关）
    f({
      println("这是一个代码块")
      100
    })
  }
}
