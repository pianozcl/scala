
//嵌套风格的包
package com {

  //外层包定义单例对象
  object Outer {
    var out: String = "out"

    def main(args: Array[String]): Unit = {
      //外层访问内层需要导包
    }
  }

  package zcl {
    package scala {
      object Inner {
        def main(args: Array[String]): Unit = {

          //内层包可以访问到外层对象
          println(Outer.out)
        }
      }
    }
  }
}