/* Answer */

/*
 * Example
 * scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 * res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
 */

def pack[T](ls: List[T]): List[List[T]] =
  if(ls.isEmpty) List(List())
  else {
    val (packed, next) = ls.span(_ == ls.head)
    if(next.isEmpty) List(packed)
    else packed :: pack(next)
  }

val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
pack(ls)


