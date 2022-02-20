package 算法.动态规划

/**
 * 股票收益最大化,n次买卖
 */
object StockMaxProfitN {

  def apply(prices:Array[Int]) ={
    val len = prices.length
    var dp0=0;
    var dp1= 0-prices(0)
    for (i<-1 until len){
      dp0 = Math.max(dp0,dp1 + prices(i))
      dp1 = Math.max(dp1,dp0 - prices(i))
    }
    dp0
  }
}
