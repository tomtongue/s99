/*
 * Example
 * scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
 * res0: List[Any] = List(1, 1, 2, 3, 5, 8)
 */

val x = List(1, 1) ::: List(2)
println(x)

// def flatten[T](ls: List[T]): List[T] = (List() foldLeft ls)(_ ++ _) // ???

// From the answer
def flatten(ls: List[Any]): List[Any] = ls flatMap {
  case xs: List[_] => flatten(xs)
  case e => List(e)
}

val ln = List(List(1, 1), 2, List(3, List(5, 8)))
flatten(ln)


/* -------------------- */
def flatten2(ls: List[Any]): List[Any] = ls flatMap {
  case xs: List[_] => flatten(xs)
  case x => List(x)
}

flatten2(ln)