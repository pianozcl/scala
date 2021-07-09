package c3_function

object TestFunctionAndMethod {
  def main(args: Array[String]): Unit = {

    //定义函数。跟Java method不同之处在于，Java的方法只能在类中定义。而scala函数可以在对象中定义
    def say(name: String): Unit = {
      println("inside: " + name)
    }

    def say1(): Int = {
      return 1
    }

    say("alice")
    this.say("bob")

    print(say1())
  }

  def say(name: String): Unit = {
    println("outside: " + name)
  }
}
