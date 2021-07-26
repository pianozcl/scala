package c5_collection

import scala.collection.mutable

/**
  * 可变set集合
  */
object Test7_MutableSet {
  def main(args: Array[String]): Unit = {
    //创建可变set
    val s1 = mutable.Set(1,2,3,3,3,3);


    //添加元素
    s1 += 33
    println(s1)

    s1.add(55)
    println(s1) //Set(33, 1, 2, 3, 55)

    //删除元素
    val boolean = s1.remove(55)
    println(s1) //Set(33, 1, 2, 3)
    println(boolean)  //true

    //合并集合
    val a = mutable.Set(1,2,3)
    val b = mutable.Set(4,5,6)
    a ++= b
    println(a)  //Set(1, 5, 2, 6, 3, 4)
    println(b)  //Set(5, 6, 4)

  }
}
