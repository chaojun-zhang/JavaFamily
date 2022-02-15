package leetcode.哈希

import scala.collection.mutable.ArrayBuffer

object Solution {

  def apply(a:String,b:String):Boolean ={
    val map = ArrayBuffer.fill(26)(0)
    for (x<-b){
      map(x-'a') = map(x-'a')+1
    }
    for (x<-a){
     val tmp = x-'a'
      if (map(tmp)>0){
        map(tmp) = map(tmp) - 1
      }else {
        return false
      }
    }
    true

  }

  def main(args: Array[String]): Unit = {
    println(Solution("aa", "aab"))
    println(Solution("aa", "ab"))
  }

}

