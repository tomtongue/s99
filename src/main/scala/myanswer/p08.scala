package myanswer

object p08 {
  def main(args: Array[String]): Unit = {
    val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val newLs = compress(ls)
    println(newLs.toString) // => List('a, 'b, 'c, 'a, 'd, 'e)
  }

  // Recapped
  def compress[T](ls: List[T]): List[T] = ls match {
    case Nil => Nil
    case x :: xs => x :: compress(compress(xs.dropWhile(_ == x)))
  }
}
