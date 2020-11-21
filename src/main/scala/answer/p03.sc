/* Answer */
def nth[T](n: Int, l: List[T]): T = (n, l) match {
  case (0, x :: _) => x
  case (n, _ :: xs) => nth(n - 1, xs)
  case (_, Nil) => throw new NoSuchElementException
}