package leetcode.dp

/**
 * 冷冻期
 */
object StockMaxProfitNWithCold {

  def apply(prices:Array[Int]) ={
    val len = prices.length
    //手上持有股票
    var f0 = 0- prices(0)
    //手上不持有股票，处于冷冻期
    var f1 = 0
    //手上不持有股票，不处于冷冻期
    var f2 = 0

    for (i<- prices.indices) {
      val newf0 = Math.max(f0,f2 - prices(i))
      val newf1 = f0 + prices(i)
      val newf2 = Math.max(f1,f2)
      f0= newf0
      f1 = newf1
      f2 = newf2
    }
    Math.max(f1,f2)
  }
}
