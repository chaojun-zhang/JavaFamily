package leetcode.string

import scala.collection.mutable.ArrayBuffer

/**
 * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 */
object LetterCombinations {

  def apply(digits: String): List[String] = {

    if (digits== null || digits.length==0) return List()

    val map = Map(
      '2' -> List("a", "b", "c"),
      '3' -> List("d", "e", "f"),
      '4' -> List("g", "h", "i"),
      '5' -> List("j", "k", "l"),
      '6' -> List("m", "n", "o"),
      '7' -> List("p", "q", "r", "s'"),
      '8' -> List("t", "u", "v"),
      '9' -> List("w", "x", "y", "z")
    )


    var tmp = map(digits(0))
    for (i <- 1 until digits.length) {
      tmp = combination(tmp,map(digits(i)))
    }
    tmp
  }

  def combination(a: List[String], b: List[String]): List[String] = {
    (a, b) match {
      case (Nil, Nil) => List()
      case (_, Nil) => a
      case (Nil, _) => b
      case (_, _) => for (x <- a; y <- b) yield s"$x$y"
    }
  }
}
