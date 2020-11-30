/* Answer */

/*
 * Example
 * scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
 * res0: List[Any] = List(1, 1, 2, 3, 5, 8)
 */

def flatten(ls: List[Any]): List[Any] = ls flatMap {
  case xs: List[Any] => flatten(xs) // Or case xs: List[_] => ...
  case x => List(x)
}