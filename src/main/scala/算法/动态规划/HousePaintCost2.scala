package 算法.动态规划

object HousePaintCost2 {

  def apply(costs:Array[Array[Int]]):Int={
    if (costs.length==0 ) return 0
    var preCosts  = new Array[Int](costs(0).length)

    for (col<- costs(0).indices){
      preCosts(col) = costs(0)(col)
    }

    for (row<- 1 until costs.length){
      val curColors = new Array[Int](costs(0).length)
      for (col<- costs(0).indices) {
          curColors(col) =  preCosts.zipWithIndex.filter(_._2!=col).map(_._1).min + costs(row)(col)
      }
      preCosts = curColors

    }
    preCosts.min
  }
}
