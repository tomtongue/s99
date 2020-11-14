package answer

import java.util.NoSuchElementException

object p03 {
  def main(args: Array[String]): Unit = {
    val li = List(1, 1, 2, 3, 5, 8)
    val ls = List("Hello", "World", "Tom")

    try {
      nth(2, li)
      nth(1, ls)
      nth(10, li)
    } catch {
      case e: Exception => e.printStackTrace()
    }

  }

  def nth[T](n: Int, l: List[T]): T =
    if(n >= 0) l(n)
    else throw new NoSuchElementException
}
