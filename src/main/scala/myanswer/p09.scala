package myanswer

object p09 {
  def main(args: Array[String]): Unit = {
    val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(pack(ls).toString)

  }

  // Recapped
  def pack[T](ls: List[T]): List[List[T]] =
    if(ls.isEmpty) List(List())
    else {
      val (packed, next) = ls span (_ == ls.head)
      if(next.isEmpty) List(packed)
      else packed :: pack(next)
    }
}
