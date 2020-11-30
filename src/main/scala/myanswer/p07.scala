package myanswer

object p07 {
  def main(args: Array[String]): Unit = {
    val ln = List(List(1, 1), 2, List(3, List(5, 8)))
    val ln2 = List(List(1, 2, 3, 4, 5))

    println(flatten(ln))
    println(flatten(ln2))

  }

  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case xs: List[_] => flatten(xs)
    case x => List(x)
  }
}
