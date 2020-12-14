val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

// !wrong answer
def compress[T](ls: List[T]): List[T] = ls match {
  case x :: Nil => List(x)
  case x1 :: x2 :: xs => {
    if(x1.equals(x2)) x2 :: compress(xs.tail)
    else x1 :: x2 :: compress(xs)
  }
}

compress(ls) // => res0: List[Symbol] = List('a, 'a, 'b, 'c, 'a, 'd, 'e, 'e)

def compress2[T](ls: List[T]): List[T] = ls match {
  case Nil => Nil
  case x :: xs => x :: compress2(xs.dropWhile(_ == x))
}

compress2(ls)


/* ---------------------- */
def compress3[T](ls: List[T]): List[T] = ls match {
  case Nil => Nil
  case x :: xs => x :: compress3(xs dropWhile (_ == x))
}

compress3(ls)