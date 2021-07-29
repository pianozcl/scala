package c5_collection

object Test14_HighLevelFunction_Map {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5,6,7,8,9);

    //过滤，选取偶数
    val evenList = list.filter((elem: Int) => {elem % 2 == 0})

    println(evenList) //List(2, 4, 6, 8)

    //选取偶数，lambda简化。当前只有一个elem参数，可以省略以_替代
    val evelList2 = list.filter(_ % 2 == 0)


    //把集合中的元素*2
    println(list.map(_ * 2))  //List(2, 4, 6, 8, 10, 12, 14, 16, 18)

    //平方
    println(list.map(x => x * x)) //List(1, 4, 9, 16, 25, 36, 49, 64, 81)



    //扁平化
    val nestedList: List[List[Int]] = List(List(1,2,3), List(5,6), List(7,8))
    val flatList = nestedList(0) ::: nestedList(1) ::: nestedList(2)
    println(flatList) //List(1, 2, 3, 5, 6, 7, 8)

    println(nestedList.flatten) //List(1, 2, 3, 5, 6, 7, 8)

    //扁平映射
    //将一组单词分词，并保存成单词列表
    val strings: List[String] = List("hello world", "hello scala", "hello java")
    val splitList: List[Array[String]] = strings.map(_.split(" "))
    println(splitList.mkString)
    println(splitList.flatten)  //List(hello, world, hello, scala, hello, java)

    val flatMapList = strings.flatMap(_.split(" "))
    println(flatMapList)  //List(hello, world, hello, scala, hello, java)

    //分组
    //分成奇偶两组, key为组名，val为一个list
    val groupMap = list.groupBy(_ % 2)  //Map(1 -> List(1, 3, 5, 7, 9), 0 -> List(2, 4, 6, 8))
    println(groupMap)

    val groupMap2 = list.groupBy(data => {
      if (data % 2  == 0) "even" else "odd"
    })
    println(groupMap2) //Map(odd -> List(1, 3, 5, 7, 9), even -> List(2, 4, 6, 8))

    //根据单词首字母分组
    val wordList = List("ccc", "aaa", "aaa", "asdasd", "bnbnm", "nbmbj", "mmm", "bba")
    println(wordList.groupBy(_.charAt(0)))  //Map(n -> List(nbmbj), a -> List(aaa, aaa, asdasd), m -> List(mmm), b -> List(bnbnm, bba), c -> List(ccc))
  }
}
