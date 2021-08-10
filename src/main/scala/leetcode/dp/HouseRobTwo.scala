package leetcode.dp

object HouseRobTwo {

  def apply(nums: Array[Int]): Int = {

    if (nums.length<=2){
      val res = nums.length match {
        case 0 => 0
        case 1 => nums(0)
        case 2=> Math.max(nums(0),nums(1))
      }
      return res
    }


    Math.max(myRob(nums,0,nums.length-2),myRob(nums,1,nums.length-1))

  }

  def myRob(nums:Array[Int],start:Int, end:Int):Int ={
    var res = 0
    val dp = new Array[Int](end-start)
    dp(0) =  nums(start)
    dp(1) = Math.max(nums(start),nums(start+1))
    for (i<-start+2 until end) {
      dp(i) = Math.max(dp(i - 2) + nums(i), dp(i - 1))
      res = Math.max(res, dp(i))
    }

    res
  }

}
