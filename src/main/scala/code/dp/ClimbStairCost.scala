package code.dp

object ClimbStairCost {

  def apply(cost:Array[Int]):Int ={

    val dp= new Array[Int](cost.length)

    dp(0) = cost(0)
    dp(1) = cost(1)
    for (i<- 2 until cost.length){
      dp(i)= Math.min(dp(i-2),dp(i-1)) + cost(i)
    }

    Math.min(dp(cost.length-2),dp(cost.length-1))
  }

}
