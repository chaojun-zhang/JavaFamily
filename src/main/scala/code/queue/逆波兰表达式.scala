package code.queue

import scala.collection.mutable

object Calculator {

  def apply(v:Array[String]):Int={


    val stack = new mutable.Stack[Int]()

    for (a<-v){
      a.trim match {
        case "+" => {
          val right = stack.pop()
          val left = stack.pop()
          stack.push(left + right)
        }
        case "-" =>{
          val right = stack.pop()
          val left = stack.pop()
          stack.push(left - right)
        }
        case "*" =>{
          val right = stack.pop()
          val left = stack.pop()
          stack.push(left * right)
        }
        case "/" =>{
          val right = stack.pop()
          val left = stack.pop()
          stack.push(left / right)
        }
        case it => {
          stack.push(it.toInt)
        }
      }
    }
    stack.pop()
  }

  def main(args: Array[String]): Unit = {
    println(Calculator(Array("2", "1", "+", "3", "*")))
    println(Calculator(Array("4", "13", "5", "/", "+")))
    println(Calculator(Array("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+")))


  }

}
