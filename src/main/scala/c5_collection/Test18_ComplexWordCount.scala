package c5_collection

object Test18_ComplexWordCount {
  def main(args: Array[String]): Unit = {
    val stringList: List[(String, Int)] = List(
      ("hello", 1),
      ("hello word", 2),
      ("java ee", 3),
      ("java ee is easy", 4)
    )

    //思路1，直接展开为普通版本
    val newStringList = stringList.map(
      kv => {
        (kv._1 + " ") * kv._2
      }
    )

    println(newStringList)  //List(hello , hello word hello word , java ee java ee java ee , java ee is easy java ee is easy java ee is easy java ee is easy )
    val s1 = newStringList.flatMap(_.split(" "))
    println(s1) //List(hello, hello, word, hello, word, java, ee, java, ee, java, ee, java, ee, is, easy, java, ee, is, easy, java, ee, is, easy, java, ee, is, easy)

    val s2 = s1.groupBy(word => word)
    println(s2) //Map(is -> List(is, is, is, is), java -> List(java, java, java, java, java, java, java), easy -> List(easy, easy, easy, easy), hello -> List(hello, hello, hello), ee -> List(ee, ee, ee, ee, ee, ee, ee), word -> List(word, word))

    val s3 = s2.map(kv => (kv._1, kv._2.size))
    println(s3) //Map(is -> 4, java -> 7, easy -> 4, hello -> 3, ee -> 7, word -> 2)

    val s4 = s3.toList.sortBy(_._2)(Ordering[Int].reverse)
    println(s4) //List((java,7), (ee,7), (is,4), (easy,4), (hello,3), (word,2))




    //solution 2
    val tuples = stringList.flatMap(
      tuple => {
        val strs = tuple._1.split(" ")
        strs.map(word => (word, tuple._2))
      }
    )
    println(tuples) //List((hello,1), (hello,2), (word,2), (java,3), (ee,3), (java,4), (ee,4), (is,4), (easy,4))

    val map1 = tuples.groupBy(kv => (kv._1))
    println(map1) //Map(is -> List((is,4)), java -> List((java,3), (java,4)), easy -> List((easy,4)), hello -> List((hello,1), (hello,2)), ee -> List((ee,3), (ee,4)), word -> List((word,2)))

    //叠加map中value值
    val map2 = map1.mapValues(
      tuple => tuple.map(kv => kv._2).sum
    )
    println(map2) //Map(is -> 4, java -> 7, easy -> 4, hello -> 3, ee -> 7, word -> 2)
    val list = map2.toList.sortWith(_._2 > _._2)
    println(list) //List((java,7), (ee,7), (is,4), (easy,4), (hello,3), (word,2))
  }
}
