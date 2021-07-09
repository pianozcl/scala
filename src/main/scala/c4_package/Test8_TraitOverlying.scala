package c4_package

object Test8_TraitOverlying {
  def main(args: Array[String]): Unit = {
    val student8 = new Student8
    student8.increase()

    //钻石问题特征叠加
    val myFootBall = new MyFootBall
    println(myFootBall.description()) //my ball is redfootball

    //可以指定调要调用的父类
    val myFootBall2 = new MyFootBall2
    println(myFootBall2.description())  //my ball is football
  }
}


trait Talent8 {
  def sing(): Unit
  def dance(): Unit

  def increase(): Unit = {
    println("talent")
  }
}


trait Knowledge8 {
  var amount: Int = 0
  def increase(): Unit = {
    println("knowlege8")
  }
}

class Student8 extends Student6 with Talent8 with Knowledge8 {
  override def sing(): Unit = {
    println("sing")
  }

  override def dance(): Unit = {
    println("dance")
  }

  override def increase(): Unit = {
    //输出的是Knowledge的increase。（当有父类和多个特质，super调用的是最后一个）
    super.increase()
  }
}

//菱形继承关系测试
//抽取子类共同特性 输出       my ball is redfootball
//先从右至左
trait Ball {
    def description(): String = "ball"
}

trait ColorBall extends Ball {
  var color: String = "red"
  override def description(): String = color + super.description()
}

trait CateforyBall extends Ball {
  var category: String = "foot"
  override def description(): String = category + super.description()
}

class MyFootBall extends CateforyBall with ColorBall {
  override def description(): String = "my ball is " + super.description()
}

class MyFootBall2 extends CateforyBall with ColorBall {
  override def description(): String = "my ball is " + super[CateforyBall].description()
}