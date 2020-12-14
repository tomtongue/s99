/*
 * Example:
 * scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 * res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
 */

val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

// !wrong answer
def pack[T](ls: List[T]): List[List[T]] = ls match {
  case x :: xs => if(x == xs.head) List(x :: List(xs.head)) ::: pack(xs.tail) else pack(xs.tail)
  case Nil => List(List())
}

pack(ls)


def pack2[T](ls: List[T]): List[List[T]] =
  if(ls.isEmpty) List(List())
  else {
    val (packed, next) = ls.span(_ == ls.head)
    if(next == Nil) List(packed)
    else packed :: pack2(next)
  }

pack2(ls)


/* ------------------------ */
def pack3[T](ls: List[T]): List[List[T]] =
  if(ls.isEmpty) List(List())
  else {
    val (packed, next) = ls.span(_ == ls.head)
    if(next == Nil) List(packed)
    else packed :: pack3(next)
  }

pack3(ls)
