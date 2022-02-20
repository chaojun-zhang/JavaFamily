package 算法.字符串

import scala.collection.mutable.ArrayBuffer

/**
 * https://leetcode-cn.com/problems/zigzag-conversion
 */
object ZConvert {

  def apply(value: String, numRows: Int): String = {
    if (numRows<2) return value
    val rows: ArrayBuffer[StringBuilder] = new ArrayBuffer[StringBuilder]()
    for (_ <- Range(0,numRows)) {
      rows += new StringBuilder()
    }
    var idx = 0
    var flag = 1
    for (c <- value) {
      rows(idx).append(c)
      if (idx == numRows - 1) {
        flag = -1
      } else if (idx == 0) {
        flag = 1
      }
      idx = idx + flag
    }
    rows.mkString("")
  }

}
