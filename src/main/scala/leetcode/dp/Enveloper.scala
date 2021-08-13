package leetcode.dp

object Enveloper {
  def apply(envelopes: Array[Array[Int]]): Int = {
    val a = envelopes.sortWith((a,b)=>a(0)>= b(0))
    val dp = new Array[Int](envelopes.length)
    //初始状态为到dp(i)时都至少有一个信封
    java.util.Arrays.fill(dp,1)
    var res =0

    for(i<- 0 until envelopes.length){
      for (j<-0 until i){
        if (a(i)(0) >a(j)(0) && a(i)(1)>a(j)(1)){
          dp(i) = Math.max(dp(i),dp(j) + 1)

        }
        res =Math.max(res,dp(i))
      }
    }


    res

  }
}
