package myanswer

import java.util.NoSuchElementException

/*
 * Example
 * scala> penultimate(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 5
 */

object p02 {
  def main(args: Array[String]): Unit = {
    val li = List(1, 1, 2, 3, 5, 8)
    val ls = List("Hello", "World", "Tom")
    val ln = List()
    try {
      println(penultimate(li).toString)
      println(penultimate(ls))
      // println(penultimate(ln))

      println(penulimatAns(li))
      println(penulimatAns(ls))
    } catch  {
      case nse: NoSuchElementException => nse.printStackTrace()
      case e: Exception => e.printStackTrace()
    }


  }

  def penultimate[T](l: List[T]): T =
    if(l.length >= 2) l.init.last
    else throw new NoSuchElementException
}
