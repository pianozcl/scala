package c5_collection

object Test11_CommonOperation {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,5,3,5)
    val set = Set(1,2,3,3,2,3,5)

    //获取集合长度
    println(list.length)

    //size是顶层父类的方法，每个集合都可以调用
    println(list.size)
    println(set.size)

    //遍历集合
    for (elem <- list) {
      println(elem)
    }

    set.foreach(println)


    //生成字符串
    println(list) //List(1, 2, 3, 5, 3, 5)
    println(list.mkString("--"))  //1--2--3--5--3--5

    //是否包含
    println(list.contains(3))
  }
}
