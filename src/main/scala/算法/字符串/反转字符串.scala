package 算法.字符串

import scala.collection.mutable

case class ReverseString(str:String) {

  def apply():String = {
    var left = 0
    var right = str.length -1
    val ch= str.toCharArray
    while (left<= right){
      val tmp = ch(left)
      ch(left) = ch(right)
      ch(right) = tmp
      left = left +1
      right =right-1
    }
    new String(ch)
  }
}

case class ReverseWord(str:String) {
  def apply():String = {
    var left = 0
    var right = str.length -1
    val ch= str.toCharArray
    //去除2边的空格
    while(ch(left)==' '){
      left = left +1
    }
    while (ch(right) == ' '){
      right = right -1
    }

    val stack = new mutable.Stack[String]
    val sb = new StringBuilder()
    while (left<= right){
      if (ch(left)!= ' '){
        sb.append(ch(left))
      }else {
        stack.push(sb.toString())
        sb.clear()
      }
      left = left +1
    }
    stack.push(sb.toString())
    stack.mkString(" ")
  }
}

case class ReverseWord2(str:String) {
  def apply():String = {
    var left = 0
    var right = str.length -1
    val ch= str.toCharArray
    //去除2边的空格
    while(ch(left)==' '){
      left = left +1
    }
    while (ch(right) == ' '){
      right = right -1
    }

    val sb = new StringBuilder()
    var high = left
    var low = left
    while (high<= right){
      if (ch(high)== ' '){//单词结尾
        sb.append(ReverseString(str.substring(low,high))())
        sb.append(" ")
        low = high
      }
      high = high +1
    }

    sb.append(ReverseString(str.substring(low,high))())
    sb.toString()

  }
}

object ReverseString{

  def main(args: Array[String]): Unit = {
    println(ReverseString("abcdef")())
    println(ReverseWord("hello world")())
    println(ReverseWord2("hello world")())

  }
}
