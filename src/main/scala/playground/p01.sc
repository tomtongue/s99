/*
 * Example
 * scala> last(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 8
 */

// def last[T](l: List[T]): T = l.last // Pattern 1
// def last[T](l: List[T]): T = l.reverse.head // Pattern 2
def last[T](l: List[T]): T = l match {
   case List() => throw new NoSuchElementException
   case x :: Nil => x
   case x :: xs => last(xs)
}

val ln = List()
val li = List(1, 1, 2, 3, 5, 8)
val ls = List("Hello", "World", "Tom")
// (last(ln) == NoSuchElementException) // => java.util.NoSuchElementException
assert(last(li) == 8)
assert(last(ls) == "Tom")