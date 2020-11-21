package answer

object p05 {
  def main(args: Array[String]): Unit = {
    val ln = List(1, 1, 2, 3, 5, 8)
    val ls = List("Hello", "World", "Tom")

    println(reverse(ln))
    println(reverse(ls))
  }

  def reverse[T](l: List[T]): List[T] = l match {
    case x :: Nil => List(x)
    case x :: xs => reverse(xs) ++ List(x)
  }
}
