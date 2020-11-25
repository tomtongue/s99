/* Answer */

/* Example
 * scala> penultimate(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 5
 */

def penulimate[T](ls: List[T]): T = ls match {
  case x1 :: x2 :: Nil => x1
  case _ :: xs => penulimate(xs)
}

val ln = List(1, 1, 2, 3, 5, 8)
penulimate(ln)


/* Just for fun, generic nth function */

// Non-builtin solution
def penulimateNth[T](n: Int, ls: List[T]): T = {
  def lastNthR(count: Int, resultList: List[T], curList: List[T]): T = curList match {
    case Nil if count > 0 => throw new NoSuchElementException
    case Nil => resultList.head
    case _ :: xs => lastNthR(count - 1, if(count > 0) resultList else resultList.tail, xs)
  }
  if(n <= 0) throw new IllegalArgumentException
  else lastNthR(n, ls, ls)
}

penulimateNth(2, ln)
