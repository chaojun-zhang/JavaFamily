package leetcode.calc

import java.util

import scala.collection.mutable.ArrayBuffer

object Calculator {

  sealed trait Expr
  case class Parent(expr:Expr) extends Expr
  case class Num(x:BigDecimal) extends Expr
  case class UnaryExpr(op:String,expr:Expr) extends Expr
  case class BinaryExpr(op:String,left:Expr,right:Expr) extends Expr

  def apply(value: String): String = {

    val parts = ArrayBuffer[String]()

    val digit = new StringBuilder
    for (c <- value) {
      c match {
        case x if x.isDigit => digit.append(x)
        case '(' | ')' | '+' | '-' | '*' | '/' => {
          if (!digit.isEmpty) {
            parts.addString(digit)
            digit.clear()
          }
          parts.append(c.toString)
        }
        case ' ' =>
        case _=> throw new IllegalArgumentException(s"Invalid char ${c}")
      }

    }

    val opStack = new util.Stack[Expr]
    val numStack = new util.Stack[Expr]
    var parentExpr:Parent = null
    for (part <- parts) {
      part match {
        case "(" => parentExpr = Parent()
        case "+" | "-" | "*" | "/" | "(" => opStack.push(part)
        case _ => numStack.push(BigDecimal(part))
      }


    }


  }
}
