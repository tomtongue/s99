def isPalindrome[T](ls: List[T]): Boolean = ls == ls.reverse

val ln = List(1, 2, 3, 2, 1)
val ln2 = List(1, 2, 5, 9, 3, 2, 1)
val ls = List("Hello", "World", "Tom", "World", "Hello")
val ls2 = List("Hello", "World", "Tom", "orld", "Hello")
val ln3 = List(1, 2, 3, 4, 4, 3, 2, 1)
isPalindrome(ln)
isPalindrome(ln2)
isPalindrome(ls)
isPalindrome(ls2)
isPalindrome(ln3)