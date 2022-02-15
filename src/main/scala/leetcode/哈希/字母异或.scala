package leetcode.哈希

import scala.collection.mutable.ArrayBuffer

case class StringXor(a:String,b:String) {

  def apply():Boolean  ={
    val set = ArrayBuffer.fill[Int](26)(0)
    for (c<- a ){
      val i = c -'a'
      set(i) = set(i) +1
    }
    for (c<- b){
      val i = c -'a'
      set(i) = set(i) - 1
    }
    set.forall(_ ==0)
  }
}

object StringXor{
  def main(args: Array[String]): Unit = {
    println(StringXor("aee", "eea")())
    println(StringXor("aee", "eaa")())
  }
}
