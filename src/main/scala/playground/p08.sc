val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)


def compress[T](ls: List[T]): List[T] = ls match {
  case x :: Nil => List(x)
  case x1 :: x2 :: xs => {
    if(x1.equals(x2)) x2 :: compress(xs.tail)
    else x1 :: x2 :: compress(xs)
  }
}

compress(ls)

def compress2[T](ls: List[T]): List[T] = ls match {
  case Nil => Nil
  case x :: xs => x :: compress2(xs.dropWhile(_ == x))
}

compress2(ls)