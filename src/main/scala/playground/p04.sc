val le = List()
val ls = List("Hello", "World", "Tom")
val ln = List(1, 1, 2, 3, 5, 8)

def length[T](l: List[T]): Int = l.length
length(ls)
length(ln)


def length2[T](l: List[T]): Int = l match {
  case List() => print("This is the last element\n"); 0
  case x :: xs => println(x + ", " + xs.toString()); length2(xs) + 1
}

length2(ln)
