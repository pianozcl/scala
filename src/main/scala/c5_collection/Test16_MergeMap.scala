package c5_collection

import scala.collection.mutable

object Test16_MergeMap {
  def main(args: Array[String]): Unit = {
    val map1 = Map("a" -> 1, "b" -> 3, "c" ->10)
    val map2 = mutable.Map("a" -> 3, "b" -> 22, "f" -> 33)

    println(map1 ++ map2) //Map(a -> 3, b -> 22, c -> 10, f -> 33)


    //将map1合并到map2最终返回新到map
    //fold以map2作为初始值
    val map3 = map1.foldLeft(map2)(
      (mergedMap, kv) => {
        val key = kv._1
        val value = kv._2

        //当map2包含key，进行累加map1的元素，不包含用0+
        mergedMap(key) = mergedMap.getOrElse(key, 0) + value
        mergedMap
      }
    )
    println(map3) //Map(b -> 25, a -> 4, c -> 10, f -> 33)
  }
}
