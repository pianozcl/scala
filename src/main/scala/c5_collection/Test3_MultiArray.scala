package c5_collection

/**
  * 多维数组
  */
object Test3_MultiArray {
  def main(args: Array[String]): Unit = {

    //两行三列而为数组
    val array = Array.ofDim[Int](2, 3)
    array(1)(1) = 100
    array(0)(2) = 200
    println(array)  //[[I@340f438e

    for (i <- 0 until array.length) {
      for (j <- 0 until array(0).length) {
        println(array(i)(j))
      }
    }

    for (i <- 0 until array.length; j <- 0 until array(0).length) println(array(i)(j))

    array.foreach(line => line.foreach(println))
  }
}
