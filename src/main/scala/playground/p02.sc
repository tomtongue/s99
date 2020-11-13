/*
 * Example
 * scala> penultimate(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 5
 */

def penultimate[T](l: List[T]): T = l match {
  case x :: xs => if(xs.length >= 2) penultimate(xs) else x
  case _ => throw new NoSuchElementException
}

def penultimate_2[T](l: List[T]): T = l.reverse.tail.head

val ln = List()
val li = List(1, 1, 2, 3, 5, 8)
val ls = List("Hello", "World", "Tom")

// penultimate(ln)
assert(penultimate(li) == 5)
assert(penultimate(ls) == "World")


penultimate_2(li)
penultimate_2(ls)
assert(penultimate_2(li) == 5)
assert(penultimate_2(ls) == "World")
