package c4_package

object Test9_AppAndEnum {
  def main(args: Array[String]): Unit = {
    println(Enum.OBJ1)
  }
}

//枚举类对象
object Enum extends Enumeration {
  val OBJ1 = Value(1, "HAHA")
  val oBJ2 = Value(2, "aa")
}

//包装了一个main方法，直接可以执行
object TestApp extends App {
  println("app")
}


