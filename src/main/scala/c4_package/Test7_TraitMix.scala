package c4_package

//特质混入
object Test7_TraitMix {
  def main(args: Array[String]): Unit = {
    val student = new Student7
    student.increase()

    //动态混入，创建对象的时候才混入特质
    val studentWithTalent = new Student7 with Talent {
      override def dance(): Unit = {
        println("dancing")
      }

      override def sing(): Unit = {
        println("singing")
      }
    }
    studentWithTalent.dance()
  }
}

trait Talent {
  def sing(): Unit
  def dance(): Unit
}


trait Knowledge {
  var amount: Int = 0
  def increase(): Unit
}


class Student7 extends Person6 with Young with Knowledge {
  //需要重写冲突的属性

  override val name: String = "student"

  override def eat(): Unit = {
    println(s"${name}")
  }

  def study(): Unit = {
    println("studying")
  }

  override def say(): Unit = {
    super.say()
  }


  override def increase(): Unit = {
    amount += 1
    println(amount)
  }
}
