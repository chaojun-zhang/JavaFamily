package leetcode.dp

object HousePaintCost {

  def apply(costs: Array[Array[Int]]): Int = {
    val rows = costs.length
    if (rows == 0) return 0

    var preRed = costs(0)(0)
    var preBlue = costs(0)(1)
    var preGreen = costs(0)(2)

    for (row <- 1 until rows) {
      val curRed = Math.min(preBlue, preGreen) + costs(row)(0)
      val curBlue = Math.min(preRed, preGreen) + costs(row)(1)
      val curGreen = Math.min(preBlue, preRed) + costs(row)(2)

      preRed = curRed
      preBlue = curBlue
      preGreen = curGreen
    }

    Array(preRed, preBlue, preGreen).min

  }

}
