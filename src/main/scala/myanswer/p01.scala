package myanswer

import scala.annotation.tailrec

/*
 * s99 questions & solutions
 * 2020-11-13
 * p01
 */

object p01 {
  def main(args: Array[String]): Unit = {
    val li = List(1, 1, 2, 3, 5, 8)
    val ls = List("Hello", "World", "Tom")

    println(last(li).toString)
    println(last(ls))
  }

  @tailrec
  def last[T](l: List[T]): T = l match {
    case x :: Nil => x
    case x :: xs => last(xs)
    case List() => throw new NoSuchElementException
  }
}

/* Result
8
Tom
 */