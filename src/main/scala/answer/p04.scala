package answer

object p04 {
  def main(args: Array[String]): Unit = {
    val le = List()
    val ls = List("Hello", "World", "Tom")
    val ln = List(1, 1, 2, 3, 5, 8)

    println(length(le))
    println(length(ls))
    println(length(ln))

  }

  def length[T](l: List[T]): Int = l match {
    case List() => 0
    case x :: xs => length(xs) + 1
  }
}

/* Result
 * 0
 * 3
 * 6
 */