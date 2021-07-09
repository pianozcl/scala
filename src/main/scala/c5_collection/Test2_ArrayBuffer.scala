package c5_collection

import scala.collection.mutable.ArrayBuffer

/**
  * 可变数组
  */
object Test2_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    //创建可变数组
    var arr1 = new ArrayBuffer[Int]()
    var arr2 = ArrayBuffer(1, 2, 3)

    println(arr1.mkString("--"))
    println(arr2)

    //访问元素
    println(arr2(1))

    //修改元素
    arr2(1) = 10
    println(arr2(1))

    //添加元素. :+之适用于不可变数组，虽然可变数组能用，但是需要返回一个新的数组，而新旧数组显然不是一个对象
    val newarr1 = arr1 :+ 15
    println(arr1 == newarr1) //false

    //不可变数组追加的方式
    arr1 += 15
    println(arr1) //ArrayBuffer(15)
    arr1 += 16
    println(arr1) //ArrayBuffer(15, 16)

    arr2 = arr1
    println(arr2) //ArrayBuffer(15, 16)
    println(arr1 == arr2) //true

    //arr1 arr2指向同一个对象，arr2改变，arr1也改变
    arr2 += 13
    println(arr1) //ArrayBuffer(15, 16, 13)

    //在数组前追加
    88 +=: arr1
    println(arr1)   //ArrayBuffer(88, 15, 16, 13)

    //常用的追加方式
    arr1.append(666)  //ArrayBuffer(88, 15, 16, 13, 666)
    println(arr1)

    //在某个下标插入元素
    arr1.insert(1, 888)
    println(arr1)   //ArrayBuffer(88, 888, 15, 16, 13, 666)

    //删除某个下标下的元素
    arr1.remove(3)
    println(arr1) //ArrayBuffer(88, 888, 15, 13, 666)

    //从3下标开始，删除两个元素
    arr1.remove(3, 2)
    println(arr1) //ArrayBuffer(88, 888, 15)

    //可变数组转换为不可变数组
    val arr = ArrayBuffer(1,3,2,2,2)
    val array = arr.toArray
    println(arr)  //ArrayBuffer(1, 3, 2, 2, 2)
    println(array.mkString("-"))    //1-3-2-2-2

    //不可变转可变数组
    val buffer = array.toBuffer
    println(buffer) //ArrayBuffer(1, 3, 2, 2, 2)
  }
}
