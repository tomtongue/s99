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

## My solutions & Answers

| Question | Difficulty | My Solution | Recap | Answer |
|:-|:-:|:-|:-:|:-|
| 1. Find the last element of a list. | `*` | [p01.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/myanswer/p01.scala) | [answer/p01.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/answer/p01.sc) | http://aperiodic.net/phil/scala/s-99/p01.scala |
| 2. Find the last but one element of a list. | `*` | [p02.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/myanswer/p02.scala) | Not yet | http://aperiodic.net/phil/scala/s-99/p02.scala |
| 3. Find the Kth element of a list. | `*` | [p03.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/myanswer/p03.scala) | [answer/p03.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/answer/p03.sc) | http://aperiodic.net/phil/scala/s-99/p03.scala |
| 4. Find the number of elements of a list. | `*` | [p04.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/myanswer/p04.scala) | Not yet | http://aperiodic.net/phil/scala/s-99/p04.scala |
| 5. Reverse a list. | `*` | [p05.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/myanswer/p05.scala) | Not yet | http://aperiodic.net/phil/scala/s-99/p05.scala |
| 6. Find out whether a list is a palindrome. | `*` | [p06.scala](https://github.com/tomtongue/s99/blob/main/src/main/scala/myanswer/p06.scala) | Not yet | http://aperiodic.net/phil/scala/s-99/p06.scala |