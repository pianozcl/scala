package c5_collection

/**
  * 不可变数组
  */
object Test1_ImmutableArray {
  def main(args: Array[String]): Unit = {
    //创建数字
    val arr = new Array[Int](10)

    //另一种方式
    val arr2 = Array(1,3,2,5,5)

    //不可变数组指定的是引用指向的对象，大小和长度不可变
    println(arr(1))
    arr(1) = 10
    println(arr(1))

    arr.update(1, 100)
    println(arr(1))

    //数组的遍历
    //普通for
    for (i <- 0 until  arr2.length) {
      println(arr2(i))
    }

    for (i <- arr2.indices) println(arr2(i))

    //增强for循环
    for (i <- arr2) {
      println(i)
    }

    //迭代器
    val iterator = arr2.iterator
    while (iterator.hasNext) {
      println(iterator.next())
    }

    arr2.foreach(i => println(i))
    arr2.foreach(println)
    println(arr2.mkString("--"))  //将数组以字符串的形式打印

    //向后添加元素。不可变数组本身并不会改变，而是添加元素返回一个新的数组
    val newArr2 = arr2.:+(88)
    println(newArr2.mkString("--"))

    //向前添加元素
    val arr3 = newArr2.+:("66")
    println(arr3.mkString("--"))

    var arr4 = arr3 :+ 15
    var arr5 = 16 +: arr4
    println(arr4.mkString("--"))  //66--1--3--2--5--5--88--15
    println(arr5.mkString("--"))  //16--66--1--3--2--5--5--88--15

    val arr6 = 999 +: arr5 :+ 9999
    println(arr6.mkString("--"))  //999--16--66--1--3--2--5--5--88--15--9999
  }
}
