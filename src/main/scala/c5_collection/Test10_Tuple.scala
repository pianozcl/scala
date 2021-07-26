package c5_collection

object Test10_Tuple {
  def main(args: Array[String]): Unit = {
    //创建元组
    val tuple = (1, "2323", 1111)
    println(tuple)  //(1,2323,1111)


    //访问元素
    println(tuple._1) //访问第一个元素

    println(tuple.productElement(1)) //访问索引1下的元素

    //嵌套元组
    val tuple1 = (1, 2, 3, ("111", "333"))
    println(tuple1._4._2)
  }
}
