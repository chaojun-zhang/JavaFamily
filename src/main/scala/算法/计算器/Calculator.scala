package 算法.计算器

import scala.collection.mutable

object Calculator {

  def apply(value: String): BigDecimal = {

    val nums = new mutable.Stack[BigDecimal]()
    val ops = new mutable.Stack[Char]

    def calc() = {
      val op = ops.pop
      val right = nums.pop()
      val left = nums.pop()
      op match {
        case '*' => nums.push(left * right)
        case '/' => nums.push(left / right)
        case '+' => nums.push(left + right)
        case '-' => nums.push(left - right)
      }
    }

    val num = new mutable.StringBuilder()
    for (c <- value) {
      c match {
        case x if (x >= '0' && x <= '9') => {
          num.append(x)
        }
        case '(' => ops.push(c)
        case ')' => {
          if (num.nonEmpty) {
            nums.push(BigDecimal(num.toString()))
            num.clear()
          }
          while (ops.nonEmpty && ops.top != '(') {
            calc()
          }
          ops.pop()
        }
        case '*' | '/' => {
          if (num.nonEmpty) {
            nums.push(BigDecimal(num.toString()))
            num.clear()
          }
          while (ops.nonEmpty && (ops.top == '*' || ops.top == '/')) {
            calc()
          }
          ops.push(c)
        }
        case '+' | '-' => {
          if (num.nonEmpty) {
            nums.push(BigDecimal(num.toString()))
            num.clear()
          }
          while (ops.nonEmpty && ops.top != '(') {
            calc()
          }
          ops.push(c)
        }
        case ' ' =>
        case _ => throw new IllegalArgumentException("Invalid char")
      }
    }

    while (ops.nonEmpty && ops.top != '(') {
      calc()
    }
    nums.pop()
  }
}
