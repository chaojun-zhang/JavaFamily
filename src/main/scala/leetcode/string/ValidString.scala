package leetcode.string

import java.util

/**
 * https://leetcode-cn.com/problems/valid-parentheses/
 */
object ValidString {

  def apply(value: String): Boolean = {

    val stack = new util.Stack[Char]()
    for (c <- value) {
      c match {
        case '(' | '{' | '[' => stack.push(c)
        case ')' | '}' | ']' if stack.isEmpty => return false
        case ')' => if (stack.peek() == '(') stack.pop() else return false
        case '}' => if (stack.peek() == '{') stack.pop() else return false
        case ']' => if (stack.peek() == '[') stack.pop() else return false
        case _ =>
      }
    }
    stack.isEmpty
  }
}
