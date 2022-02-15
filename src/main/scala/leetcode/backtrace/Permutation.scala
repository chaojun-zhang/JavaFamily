package leetcode.backtrace

import java.util

/**
 * 排列
 */
object Permutation {

  val res =  new util.LinkedList[util.LinkedList[String]]
  def backTrace(nums:Array[String],path:util.LinkedList[String]): Unit = {

    if (path.size == nums.length) {
      res.add(new util.LinkedList[String](path))
      return
    }
    for (num<- nums){


      if  (!path.contains(num)) {
        println("before add " + num)
        path.add(num)
        backTrace(nums,path)
        path.removeLast()
        println("after remove " + num)
      }
    }

  }

  def main(args: Array[String]): Unit = {
    backTrace(Array("1","2","3"),new util.LinkedList[String]())
    import scala.collection.JavaConversions._
    for (list<- res){
      println(list)
    }
  }
}
