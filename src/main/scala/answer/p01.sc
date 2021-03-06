/* Answer */

/*
 * vs. My answer
 * def last -> Same
 * def last2 -> Same
 *
 */

def last[T](ls: List[T]): T = ls.last

def last2[T](ls: List[T]): T = ls match {
  case x :: Nil => x
  case x :: xs => last2(xs)
  case _ => throw new NoSuchElementException
}
