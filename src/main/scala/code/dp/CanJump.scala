package code.dp

object CanJump {


  def apply(nums:Array[Int]):Int = {
    dp(nums,0)
  }


  def dp(nums:Array[Int],start:Int):Int = {
    if (start>= nums.length -1){
      return 0
    }
    var steps = Integer.MAX_VALUE
    for (i<- 1 to  nums(start)){
      steps = Math.min(steps,1+ dp(nums,start + i))
    }
    steps
  }

}
