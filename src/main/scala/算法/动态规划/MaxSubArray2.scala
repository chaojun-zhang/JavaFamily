package 算法.动态规划

object MaxSubArray2 {

  def maxSubarraySumCircular(nums: Array[Int]): Int = {
    if (nums.length==0) return 0
    val left = maxSum(java.util.Arrays.copyOfRange(nums,0,nums.length-1))
    val right = maxSum(java.util.Arrays.copyOfRange(nums,1,nums.length))
    Math.max(left + nums(nums.length-1), right + nums(0) )
  }

  def maxSum(nums: Array[Int]) :Int = {
    if (nums.length ==1) return nums(0)
    if (nums.length ==2) return Math.max(nums(0),nums(1))
    val dp = new Array[Int](nums.length)

    dp(0) = nums(0)
    var res = 0
    for (i<- 1 until nums.length){
      dp(i) = Math.max(dp(i-1) + nums(i),nums(i) )
      res = Math.max(res,dp(i))
    }
    res
  }
}
