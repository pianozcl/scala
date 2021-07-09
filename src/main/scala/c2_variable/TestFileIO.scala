package c2_variable

import java.io.PrintWriter

import scala.io.Source

object TestFileIO {
  def main(args: Array[String]): Unit = {
    //从文件读数据
    Source.fromFile("/Users/chenliangzhou/Desktop/personal-notes/scala/src/main/scala/c2_variable/test.txt").foreach(print)

    //将文件写入数据
    var writer = new PrintWriter("/Users/chenliangzhou/Desktop/personal-notes/scala/src/main/scala/c2_variable/output.txt")
    writer.write("hello writer")
    writer.close()
  }
}
