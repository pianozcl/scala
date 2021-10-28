package c5_collection

object Test17_CommonWordCount {
  def main(args: Array[String]): Unit = {
    val stringList: List[String] = List("hello", "hello world", "hello java", "java ee")

    val list: List[Array[String]] = stringList.map(_.split(" "))
    val list2 = list.flatten  //List(hello, hello, world, hello, java, java, ee)
    println(list2)


    val groupMap = list2.groupBy(word => word)
    println(groupMap)    //Map(ee -> List(ee), world -> List(world), java -> List(java, java), hello -> List(hello, hello, hello))

    val countMap = groupMap.map(kv => (kv._1, kv._2.length))
    println(countMap) //Map(ee -> 1, world -> 1, java -> 2, hello -> 3)

    val list3 = countMap.toList
    println(list3)  //List((ee,1), (world,1), (java,2), (hello,3))

    val list4 = list3.sortWith(_._2 > _._2)   //表示以当前二元组的第二个元素降序
    println(list4)  //List((hello,3), (java,2), (ee,1), (world,1))

    val list5 = list4.take(3)   //降序后取前三
    println(list5)  //List((hello,3), (java,2), (ee,1))
  }
}
