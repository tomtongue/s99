def reverse[T](l: List[T]): List[T] = l match {
  case x :: Nil => List()
  case x :: xs => reverse(xs) ++ List(x)
}

val ln = List(1, 1, 2, 3, 5, 8)
val ls = List("Hello", "World", "Tom")
reverse(ln)
reverse(ls)

/*
 * reverse(List(1, 1, 2, 3))
 * = reverse(List(1, 2, 3)) ++ List(1)
 * = {reverse(List(2, 3)) ++ List(1)} ++ List(1)
 * = {[reverse(List(3)) ++ List(2)] ++ List(1)} ++ List(1)
 * = List(3) ++ List(2) ++ List(1) ++ List(1)
 * = List(3, 2, 1, 1)
 */