package 算法.动态规划

object JumpGame {

  def apply(nums:Array[Int]):Int ={
    var maxPos = 0
    var end =0
    var step =0

    for (i<-nums.indices){
      maxPos = Math.max(maxPos,nums(i)+i)
      if (i == end){
        end = maxPos
        step = step +1
      }
    }
    step
  }
}
