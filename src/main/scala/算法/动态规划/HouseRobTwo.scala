package 算法.动态规划

import java.util

object HouseRobTwo {

  def apply(nums: Array[Int]): Int = {

    if (nums.length==0 ) return 0
    if (nums.length==1) return nums(0)
    if (nums.length==2) return Math.max(nums(0),nums(1))

    val rob1 = myRob(util.Arrays.copyOfRange(nums,0,nums.length-1))
    val rob2 = myRob(util.Arrays.copyOfRange(nums,1,nums.length))
    Math.max(rob1,rob2)
  }

  def myRob(nums:Array[Int]):Int ={
    val dp = new Array[Int](nums.length)
    dp(0) =  nums(0)
    dp(1) = Math.max(nums(0),nums(1))
    for (i<-2 until  nums.length) {
      dp(i) = Math.max(dp(i - 2) + nums(i), dp(i - 1))
    }
    dp(nums.length-1)
  }

}
