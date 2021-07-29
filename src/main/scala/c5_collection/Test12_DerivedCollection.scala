package c5_collection

object Test12_DerivedCollection {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,5,2,6,3);
    val list2 = List(1,2,3,66,77);


    println(list.head)  //1
    println(list.tail)  //List(2, 3, 5, 2, 6, 3)
    println(list.last)  //3

    //反转
    println(list.reverse)

    //取前n个元素
    println(list.take(3))   //List(1, 2, 3)


    //并集
    val union = list.union(list2)
    println(union)    //List(1, 2, 3, 5, 2, 6, 3, 1, 2, 3, 66, 77)

    //交集
    val intersection = list.intersect(list2)
    println(intersection)   //List(1, 2, 3)

    //差集
    val diff1 = list.diff(list2)
    val diff2 = list2.diff(list)
    println(diff1)    //List(5, 2, 6, 3)
    println(diff2)     //List(66, 77)
  }
}
