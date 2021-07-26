package c5_collection

import scala.collection.mutable

object Test9_MutableMap {
  def main(args: Array[String]): Unit = {
    val map1 = mutable.Map("a" -> 1, "b" -> "a")

    println(map1.getClass)  //class scala.collection.mutable.HashMap

    //添加元素
    map1.put("c", 1)
    map1.put("d", "555")
    println(map1) //Map(b -> a, d -> 555, a -> 1, c -> 1)

    map1 += (("e", 999))


    //删除元素
    map1.remove("a")
    println(map1) //Map(e -> 999, b -> a, d -> 555, c -> 1)

    map1.put("e", 888)
    println(map1) //Map(e -> 888, b -> a, d -> 555, c -> 1)

    //合并map
    val map2 = Map("immutable" -> "immutable")

    map1 ++= map2
    println(map1)   //Map(e -> 888, b -> a, immutable -> immutable, d -> 555, c -> 1)
  }
}
