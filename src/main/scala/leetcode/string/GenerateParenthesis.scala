package leetcode.string

import scala.collection.mutable.ArrayBuffer
object GenerateParenthesis {
  def apply(value: Int): List[String] = {

    val res = ArrayBuffer[String]()
    dfs(res ,value,value,"")
    res.toList
  }

  def dfs(res:ArrayBuffer[String],left:Int,right:Int,path:String): Unit = {
    println(s"left:${left}, right:${right}")
    if (left==0 && right ==0){
      res.append(path)
      return
    }
    if (left>0 ){
      dfs (res,left-1,right,path + "(")
    }

    if (left<right){
      dfs(res,left,right-1,path + ")")

    }
  }


}
