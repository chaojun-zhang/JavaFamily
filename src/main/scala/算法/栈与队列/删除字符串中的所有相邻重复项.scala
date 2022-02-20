package 算法.栈与队列

import java.util
import scala.collection.mutable

class RemoveDuplicateInString {

  val stack = new mutable.Stack[Char]

  def apply(str: String): String = {

    for (c <- str) {
      if (stack.isEmpty || stack.top != c){
        stack.push(c)
      }else {
        stack.pop()
      }
    }


    var sb = ""
    while (stack.nonEmpty) {
      sb = stack.pop() + sb
    }
    sb
  }

}

object RemoveDuplicateInString {
  def main(args: Array[String]): Unit = {
    val solution = new RemoveDuplicateInString
    println(solution.apply("abbaca"))
  }
}
