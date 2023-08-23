package code.queue

import scala.collection.mutable

class ValidParent {

  val stack = new mutable.Stack[Int]

  def isValid(str:String): Boolean = {
    stack.clear()
    if (str == null) return false
   val mapped =  str.map{
      case ')'=> stack.nonEmpty &&  stack.pop() == '('
      case ']' => stack.nonEmpty &&  stack.pop() =='['
      case it  =>
        stack.push(it)
        true
    }

    mapped .forall(_==true) && stack.isEmpty
  }

}
object ValidParent{
  def main(args: Array[String]): Unit = {
    val valid = new ValidParent
    println(valid.isValid("()"))
    println(valid.isValid("()[]"))
    println(valid.isValid("([]"))
    println(valid.isValid("(())[]"))
    println(valid.isValid("()()[]"))
  }
}
