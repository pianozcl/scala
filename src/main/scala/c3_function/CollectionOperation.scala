package c3_function

object CollectionOperation {
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(1,5,2,3,6)

    //对数组进行处理，并返回一个新数组
    def arrayOperation(arr: Array[Int], op: Int => Int): Array[Int] = {
      for (item <- arr) yield op(item)
    }

    def addOne(item: Int): Int = {
      item + 1
    }

    val newarr: Array[Int] = arrayOperation(arr, addOne)
    println(newarr.mkString(",")) //2,6,3,4,7

    val newarr1 = arrayOperation(newarr, i => i * 2)
    println(newarr1.mkString(","))

    def func(i: Int): String => (Char => Boolean) = {
      def f1(s: String): Char => Boolean = {
        def f2(c: Char): Boolean = {
          if (i == 0 && s == "" && c == '0') false else true
        }
        f2
      }
      f1
    }

    println(func(0)("")('0'))

  }
}
