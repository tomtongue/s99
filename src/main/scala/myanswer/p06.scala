package myanswer

object p06 {
  def main(args: Array[String]): Unit = {
    val ln = List(1, 2, 3, 2, 1)
    val ln2 = List(1, 2, 5, 9, 3, 2, 1)
    val ls = List("Hello", "World", "Tom", "World", "Hello")
    val ls2 = List("Hello", "World", "Tom", "orld", "Hello")
    val ln3 = List(1, 2, 3, 4, 4, 3, 2, 1)

    assert(isPalindrome(ln))
    assert(!isPalindrome(ln2))
    assert(isPalindrome(ls))
    assert(!isPalindrome(ls2))
    assert(isPalindrome(ln3))
  }

  def isPalindrome[T](ls: List[T]): Boolean = {
    val l = ls.length / 2;
    val lsNew = ls.take(l)
    val rev = ls.reverse.take(l)
    def evaluator(lxs: List[T], lys: List[T]): Boolean = (lxs, lys) match {
      case (x :: xs, y :: ys) => if(x.equals(y)) evaluator(xs, ys) else false
      case (x, y) => if(x.equals(y)) true else false
      case _ => throw new NoSuchElementException
    }
    evaluator(lsNew, rev)
  }

}
