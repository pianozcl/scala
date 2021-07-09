package c3_function

object ClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    def addByA(a: Int): Int => Int = {
      def addB(b: Int): Int = {
        a + b
      }

      addB
    }

    println(addByA(3)(4))



    //currying
    val sum: (Int, Int) => Int = (x, y) => x + y
    val curriedSum: Int => Int => Int = x => y => x + y
    println(curriedSum(1)(3))

    val curried = sum.curried
    println(curried(9)(9))


  }
}
