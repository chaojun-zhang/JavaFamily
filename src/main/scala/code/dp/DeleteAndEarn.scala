package code.dp

object DeleteAndEarn {

  def apply(nums: Array[Int]): Int = {
    val cnts = new Array[Int](10000)

    var max = 0
    for (num <- nums) {
      cnts(num) = cnts(num) + 1
      max = Math.max(max, num)
    }
    val dp = new Array[Array[Int]](max + 1)
    for (i<-0 until max+1){
      dp(i)  = new Array[Int](2)
    }
    for (i <- 1 until max + 1) {
      dp(i)(1) = dp(i - 1)(0) + i * cnts(i);
      dp(i)(0) = Math.max(dp(i)(1), dp(i - 1)(0))
    }

    Math.max(dp(max)(0), dp(max - 1)(1))
  }

}
