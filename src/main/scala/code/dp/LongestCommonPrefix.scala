package code.dp

object LongestCommonPrefix {

  def commonPrefix(a: String, b: String): String = {
    val len = Math.min(a.length, b.length)
    val sb = new StringBuilder
    for (i <- 0 until len) {
      if (a.charAt(i) == b.charAt(i)) {
        sb.append(a.charAt(i))
      } else {
        return sb.toString
      }
    }
    sb.toString()
  }

  def apply(value: Array[String]): String = {
    value match {
      case Array() => ""
      case Array(a) => a
      case Array(a, b@_*) =>
        commonPrefix(a, apply(b.toArray))
    }
  }
}
