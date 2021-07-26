package c5_collection

object Test8_ImmutableMap {
  def main(args: Array[String]): Unit = {
    //创建map
    val map1: Map[String, Int] = Map("a" -> 13, "b" -> 22)
    println(map1)
    println(map1.getClass)

    //遍历map
    map1.foreach(println)
    map1.foreach((kv: (String, Int)) => println(kv)) //等价上行代码

    //遍历所有key
    for (key <- map1.keys) {
      println(key)
    }


    //获取key的value
    println(map1.get("a"))      //Some(13)
    println(map1.get("a").get)  //13  ，不存在会出现空指针异常
    println(map1.getOrElse("xxx", 0)) //如果找不到对应的key，返回0

    println(map1("a"))  //13,等同于println(map1.get("a").get)
  }
}
