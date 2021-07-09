package c5_collection

object Test4_List {
  def main(args: Array[String]): Unit = {
    //创建List
    val list1 = List(1,3,2,24)
    val list2 = List.apply(1,2,3,4);

    println(list1)
    println(list2)
    list1.foreach(println)

    //访问元素
    println(list1(3))

    //添加元素
    val list3 = list1 :+ 13

    val list4 = list3.::(555)   //List(555, 1, 3, 2, 24, 13)
    println(list4)

    val list5 = Nil.::(13)
    println(list5)  //List(13)

    val list6 = 11 :: 33 :: 55 :: 66 :: Nil
    val list66 = 11 :: 33 :: 55 :: 66 :: Nil
    println(list6)  //List(11, 33, 55, 66)
    println(list6(0)) //11


    val list7 = Nil.::(77, 88, 66, 11)
    println(list7)  //List((77,88,66,11))

    //合并两个列表
    val list8 = list6 :: list66
    println(list8) //List(List(11, 33, 55, 66), 11, 33, 55, 66)

    val list9 = list6 ::: list66
    println(list9) //List(11, 33, 55, 66, 11, 33, 55, 66)

    val list10 = list6 ++ list66
    println(list10) //List(11, 33, 55, 66, 11, 33, 55, 66)
  }
}
