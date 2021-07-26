package c5_collection

object Test6_ImmutableSet {
  def main(args: Array[String]): Unit = {
    var set1 = Set(1,2,3,3)
    println(set1) //Set(1, 2, 3)

    val set2 = set1.+(333)
    println(set1) //Set(1, 2, 3)
    println(set2) //Set(1, 2, 3, 333)

    val set3 = set2 + 666
    println(set3) //Set(333, 666, 1, 2, 3)

    //合并集合
    val setA = Set(1,2,3)
    val setB = Set(4,5,6,3)
    val setAB = setA ++ setB
    println(setAB)  //Set(5, 1, 6, 2, 3, 4)

    //删除元素
    val set5 = set1 - 1
    println(set5) //Set(2, 3)
  }
}
