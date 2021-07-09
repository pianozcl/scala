package c5_collection

import scala.collection.mutable.ListBuffer

object Test5_ListBuffer {
  def main(args: Array[String]): Unit = {
    //创建listbuffer
    val list1 = new ListBuffer[Int]()

    //利用伴生对象创建
    val list2 = ListBuffer(1,2,3)

    //添加元素
    list1.append(1,2,3,5,5,5,5)
    println(list1)

    list1.insert(3, 8, 8, 8)
    println(list1)  //ListBuffer(1, 2, 3, 8, 8, 8, 5, 5, 5, 5)

    111 +=: 111 +=: list1 += 666 += 666
    println(list1)    //ListBuffer(111, 111, 1, 2, 3, 8, 8, 8, 5, 5, 5, 5, 666, 666)

    //这种方式不改变源list，而是生成clone一个新的list，进行++=，最后返回新的list
    val list22 = list2 ++ list2
    println(list22)  //ListBuffer(1, 2, 3, 1, 2, 3)
    println(list2)  //ListBuffer(1, 2, 3)

    //这种方式会改变源list
    list2 ++= list2
    println(list2)  //ListBuffer(1, 2, 3, 1, 2, 3)

    //这种方式改变的是list1
    list2 ++=: list1
    println(list1)  //ListBuffer(1, 2, 3, 1, 2, 3, 111, 111, 1, 2, 3, 8, 8, 8, 5, 5, 5, 5, 666, 666)
  }
}
