package code.string

object 回文字符串 {

  def isEchoString(s: List[Char]): Boolean = {
    s match {
      case Nil => false
      case first :: tail =>
        tail match {
          case Nil => true
          case second :: Nil => first == second
          case _ => first == tail.last && isEchoString(tail.dropRight(1))
        }
    }
  }
}
