package myanswer

/* 2020-11-20
 * Example
 * scala> reverse(List(1, 1, 2, 3, 5, 8))
 * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
 */

object p05 {
  def main(args: Array[String]): Unit = {
    val ln = List(1, 1, 2, 3, 5, 8)
    val ls = List("Hello", "World", "Tom")

    println(reverse(ln))
    println(reverse(ls))
  }

  def reverse[T](l: List[T]): List[T] = l match {
    case x :: Nil => List(x)
    case x :: xs => reverse(xs) ++ List(x) // Or :::
  }
}

/*
 * List(8, 5, 3, 2, 1, 1)
 * List(Tom, World, Hello)
 */
