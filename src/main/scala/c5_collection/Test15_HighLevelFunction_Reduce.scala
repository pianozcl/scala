package c5_collection

object Test15_HighLevelFunction_Reduce {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)

    println(list.reduce(_ + _)) //10


    val list2 = List(3,5,7,8)
    println(list2.reduce(_ - _))  //-17
    println(list2.reduceLeft(_ - _))  //-17 从左往右减
    println(list2.reduceRight(_ - _)) //-3        3 - (5 - (7 - 8))

    //fold
    println(list.fold(10)(_ + _))   //20   初始值+10
  }
}
