package 算法.动态规划

/**
 * 这道题和股票的最大收益类似
 */
object MaxSubArray {

  def apply(nums:Array[Int]):Int = {
    if (nums.length==1)return nums(0)
    var ans = 0
    val dp = new Array[Int](nums.length)
    dp(0)= nums(0)
    for (i<-1 until nums.length){
      dp(i)= Math.max(dp(i-1)+ nums(i),nums(i))
      ans = Math.max(ans,dp(i))
    }
    ans
  }
}
