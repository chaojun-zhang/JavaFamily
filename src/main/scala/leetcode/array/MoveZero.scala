package leetcode.array

import java.util

import scala.collection.mutable

object MoveZero {

  val cache  = new util.HashMap[Int,Int]
  def tribonacci(n: Int): Int = {
    if (cache.containsKey(n)){
      return cache.get(n)
    }
    val a = n match {
      case 0=> 0
      case 1=> 1
      case 2=> 1
      case _=> tribonacci(n-3) + tribonacci(n-2) + tribonacci(n-1)
    }
    cache.put(n,a)
    a
  }

  def apply(nums:Array[Int]) ={
    for (i<-nums.indices){
      for (j<-0 until nums.length-1-i){
        if (nums(j)==0){
          swap(nums,j,nums.length-1-j)
        }else {
          if (nums(j)>nums(j+1)){
            swap(nums,j,j+1)
          }
        }
      }
    }

  }

  def swap(value: Array[Int], i: Int, j: Int): Unit = {
    val tmp = value(i)
    value(i) = value(j)
    value(j) = tmp
  }

}
