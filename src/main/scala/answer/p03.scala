package answer

import java.util.NoSuchElementException

object p03 {
  def main(args: Array[String]): Unit = {
    val li = List(1, 1, 2, 3, 5, 8)
    val ls = List("Hello", "World", "Tom")

    try {
      println(nth(2, li))
      println(nth(1, ls))
      // nth(10, li)
      println(nth_ans(2, li))
      println(nth_ans(1, ls))
      // nth(10, li)
    } catch {
      case e: Exception => e.printStackTrace()
    }

  }

  def nth[T](n: Int, l: List[T]): T =
    if(n >= 0) l(n)
    else throw new NoSuchElementException

  def nth_ans[T](n: Int, l: List[T]): T = (n, l) match {
    case (0, x :: _) => x
    case (n, _ :: xs) => nth_ans(n - 1, xs)
    case (_, Nil) => throw new NoSuchElementException
  }
}
