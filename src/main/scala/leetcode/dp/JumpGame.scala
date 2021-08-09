package leetcode.dp

object JumpGame {

  def apply(nums:Array[Int]):Int ={
    var maxPos = 0
    var end =0
    var step =0

    for (i<-0 until nums.length){
      maxPos = Math.max(maxPos,nums(i)+i)
      if (i == end){
        end = maxPos
        step = step +1
      }
    }
    step
  }
}
