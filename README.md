# s99 - Solutions of "S-99: Ninety-Nine Scala Problems"
*Refer to [S-99: Ninety-Nine Scala Problems](http://aperiodic.net/phil/scala/s-99/) about "S-99"*.

## Overview
Note that `*` means the difficulty of a question. `*` means "easy", `**` means "intermediate" and `***` means "difficult".  

1. Find the last element of a list. `*`
2. Find the last but one element of a list. `*`
3. Find the Kth element of a list. `*`
4. Find the number of elements of a list. `*`
5. Reverse a list. `*`
6. Find out whether a list is a palindrome. `*`
7. Flatten a nested list structure. `**` -> `flatMap`
8. Eliminate consecutive duplicates of list elements. `**` -> `dropWhile`
9. Pack consecutive duplicates of list elements into sublists. `**` -> `span`

## Questions 
### 1. Find the last element of a list. `*`

```
// Example
scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
```

### 2. Find the last but one element of a list. `*`
```
// Example
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
```

### 3. Find the Kth element of a list. `*`
By convention, the first element in the list is element `0`.

```
// Example
scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
```

### 4. Find the number of elements of a list. `*`

```
// Example
scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6
```

### 5. Reverse a list. `*`

```
// Example
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
```

### 6. Find out whether a list is a palindrome. `*`

```
// Example
scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true
```

### 7. Flatten a nested list structure. `**`

```
// Example
scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)
```

### 8. Eliminate consecutive duplicates of list elements. `**`
If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.

```
// Example
scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
```

### 9. Pack consecutive duplicates of list elements into sublists. `**`
If a list contains repeated elements they should be placed in separate sublists.

```
// Example
scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
```

## My solutions & Answers

| Question | Difficulty | My Solution | Recap | Answer |
|:-|:-:|:-|:-:|:-:|
| 1. Find the last element of a list. | `*` | [p01.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/myanswer/p01.scala) | [answer/p01.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/answer/p01.sc) | http://aperiodic.net/phil/scala/s-99/p01.scala |
| 2. Find the last but one element of a list. | `*` | [p02.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/myanswer/p02.scala) | [answer/p02.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/answer/p02.sc) | http://aperiodic.net/phil/scala/s-99/p02.scala |
| 3. Find the Kth element of a list. | `*` | [p03.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/myanswer/p03.scala) | [answer/p03.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/answer/p03.sc) | http://aperiodic.net/phil/scala/s-99/p03.scala |
| 4. Find the number of elements of a list. | `*` | [p04.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/myanswer/p04.scala) | Not yet | http://aperiodic.net/phil/scala/s-99/p04.scala |
| 5. Reverse a list. | `*` | [p05.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/myanswer/p05.scala) | Not yet | http://aperiodic.net/phil/scala/s-99/p05.scala |
| 6. Find out whether a list is a palindrome. | `*` | [p06.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/myanswer/p06.scala) |  [answer/p06.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/answer/p06.sc) | http://aperiodic.net/phil/scala/s-99/p06.scala |
| :bangbang: **7. Flatten a nested list structure.** | `**` | [p07.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/myanswer/p07.scala) | [answer/p07.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/answer/p07.sc) | http://aperiodic.net/phil/scala/s-99/p07.scala |
| :bangbang: **8. Eliminate consecutive duplicates of list elements.** | `**` | [p07.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/myanswer/p08.scala) | [answer/p08.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/answer/p08.sc) | http://aperiodic.net/phil/scala/s-99/p08.scala |
| :bangbang: **9. Pack consecutive duplicates of list elements into sublists. `**`** | `**` | [p07.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/myanswer/p09.scala) | [answer/p08.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/answer/p09.sc) | http://aperiodic.net/phil/scala/s-99/p09.scala |