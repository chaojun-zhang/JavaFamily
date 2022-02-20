package 算法.动态规划

import java.util

/**
 *
 *
 * 动态规划
 * 最大上升子序列
 */
object LongestIncreasedString {

  def apply(value: Array[Int]): Int = {
    val len = value.length
    val dp = new Array[Int](len)
    util.Arrays.fill(dp, 1)
    var res = 0
    for (i <- 0 until len) {
      for (j <- 0 until i) {
        if (value(i) > value(j)) {
          dp(i) = Math.max(dp(i), dp(j) + 1)
        }
        res = Math.max(res, dp(i))
      }
    }
    res
  }
}
