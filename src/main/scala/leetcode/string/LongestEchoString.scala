package leetcode.string

import scala.util.control.Breaks.{break, breakable}

/**
 * 最长回文子串
 * https://leetcode-cn.com/problems/longest-palindromic-substring/
 */
object LongestEchoString {

  case class EchoString(value:String, left: Int, right: Int) {
    def len = right - left

    def update(that:EchoString): EchoString =  {
        if (len>= that.len) this else that
    }

    override def toString: String = value.substring(left,right)
  }

  def centerExpand(value: String, start: Int, end: Int): EchoString = {
    var left = start
    var right = end
    val len = value.length
    breakable {
      while (left >= 0 && right < len) {
        if (value(left) == value(right)) {
          left = left - 1
          right = right + 1
        } else {
          break()
        }
      }
    }

    EchoString (value,left + 1, right )
  }

  def apply(value: String): String = {
    val len = value.length
    if (len < 2) return value
    var res = EchoString(value,0,0)
    for (i <- 0 until value.length) {
      val odd = centerExpand(value, i, i)
      val even = centerExpand(value, i, i + 1)
      val echoString = if (odd.len > even.len) odd else even
      res = res.update(echoString)
    }
    res.toString
  }
}
