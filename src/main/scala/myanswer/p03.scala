package myanswer

/*
 * Example
 * scala> nth(2, List(1, 1, 2, 3, 5, 8))
 * res0: Int = 2
 */

object p03 {
  def main(args: Array[String]): Unit = {
    val li = List(1, 1, 2, 3, 5, 8)
    val ls = List("Hello", "World", "Tom")

    try {
      println(nth(2, li))
      println(nth(1, ls))
      // nth(10, li)
    } catch {
      case e: Exception => e.printStackTrace()
    }

  }

  def nth[T](n: Int, l: List[T]): T =
    if(n >= 0) l(n)
    else throw new NoSuchElementException
}
