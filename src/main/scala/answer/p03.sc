/* Answer */

/*
 * vs. My answer
 * def nth -> Same
 * def nth2 -> Need to recap
 */

def nth[T](n: Int, ls: List[T]): T = // My answer
  if(n >= 0) ls(n)
  else throw new NoSuchElementException

def nth2[T](n: Int, l: List[T]): T = (n, l) match {
  case (0, x :: _) => x
  case (n, _ :: xs) => nth(n - 1, xs)
  case (_, Nil) => throw new NoSuchElementException
}