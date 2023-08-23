package code.dp

object Solution {

  def apply(a:Array[Int],k:Int):Int ={
    if (k==0 || k>a.length){
      return 0
    }
    if (k == a.length) {
      return a.sum
    }
    val dp = new Array[Int](a.length-k+1)
    for (i<-0 until k){
      dp(0)= dp(0) + a(i)
    }

    for (i<- k until a.length){
      dp (i-k +1) = dp(i-k) - a(i-k) + a(i)
    }
    dp.max
  }

  def main(args: Array[String]): Unit = {
    println(Solution(Array(1, 2, 3, -2, 4, 8, 6), 3))
  }

}
