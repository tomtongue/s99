/*
 * // Example
 * scala> nth(2, List(1, 1, 2, 3, 5, 8))
 * res0: Int = 2
 */

def nth[T](n: Int, l: List[T]): T = {
  if(l.length >= n && l.nonEmpty && n >= 0) l(n)
  else if(l.isEmpty) throw new NoSuchElementException
  else throw new IndexOutOfBoundsException
}

def nth_2[T](n: Int, l: List[T]): T = {
  if(n >= 0) l(n)
  else throw new NoSuchElementException
}

val ln = List()
val li = List(1, 1, 2, 3, 5, 8)
val ls = List("Hello", "World", "Tom")
nth(2, li)
nth(0, li)
nth(2, ls)
nth_2(0, ln)
