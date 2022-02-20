package 算法.动态规划

import scala.collection.mutable

/**
 * 滑动窗口
 * 无重复字符的最长子串
 */
object LongestNoRepeatedString {

  def apply(value: String) = {

    val window = new mutable.HashMap[Char, Int]()
    var start = 0

    var max = 0
    for (end <- 0 until value.length) {
      val chr = value.charAt(end)
      if (window.contains(chr)) {
        start = Math.max(start, window(chr) + 1)
      }
      window(chr) = end
      max = Math.max(max, end - start + 1)

    }
    max
  }

}
