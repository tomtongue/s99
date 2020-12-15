/* Answer */

/*
 * Example
 * scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 * res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
 */


def compress[T](ls: List[T]): List[T] = ls match {
  case x :: xs => x :: compress(xs.dropWhile(_ == x))
  case Nil => Nil
}