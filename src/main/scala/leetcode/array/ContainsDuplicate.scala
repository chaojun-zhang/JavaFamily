package leetcode.array

import scala.collection.mutable

object ContainsDuplicate {

  def apply(nums:Array[Int]):Boolean = {

    val contains = new mutable.HashSet[Int]
    for (num<- nums){
      if (contains(num)) return true else contains.add(num)
    }
    false
  }

}
