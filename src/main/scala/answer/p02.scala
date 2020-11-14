package answer

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
      println(penultimate(ln))
    } catch  {
      case nse: NoSuchElementException => nse.printStackTrace()
      case e: Exception => e.printStackTrace()
    }


  }

  def penultimate[T](l: List[T]): T = l match {
    case x :: xs => if(xs.length >= 2) penultimate(xs) else x
    case _ => throw new NoSuchElementException
  }
}
