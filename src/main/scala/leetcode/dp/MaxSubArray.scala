package leetcode.dp

/**
 * 这道题和股票的最大收益类似
 */
object MaxSubArray {

  def apply(nums:Array[Int]):Int = {
    var currMax =0
    var ans = 0
    for (i<-nums.indices){
      currMax = Math.max(currMax+nums(i),nums(i))
      ans = Math.max(ans,currMax)
    }
    ans
  }
}
