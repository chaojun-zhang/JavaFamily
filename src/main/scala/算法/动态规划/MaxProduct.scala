package 算法.动态规划

/**
 * 求连续子数组的最大乘积
 */
object MaxProduct {

  def maxProduct(nums: Array[Int]): Int = {
    val fmax = new Array[Int](nums.length)
    val fmin = new Array[Int](nums.length)
    fmax(0) = nums(0)
    fmin(0) = nums(0)
    for (i <- 1 until nums.length) {
      fmax(i) = Math.max(Math.max(fmax(i-1)*nums(i),fmin(i-1) * nums(i)),nums(i))
      fmin(i) = Math.min(Math.min(fmax(i-1)*nums(i),fmin(i-1) *  nums(i)),nums(i))
    }

   fmax(nums.length-1)

  }
}
