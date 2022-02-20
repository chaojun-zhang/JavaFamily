package 算法.动态规划

/**
 * 一次买卖的最大利润
 */
object StockMaxProfitOne {

  def apply(prices:Array[Int]) = {

    var min = prices(0)
    var res =0

    for (i<-prices.indices){
      res = Math.max(res,prices(i)- min)
      min = Math.min(min,prices(i))
    }
    res
  }
}
