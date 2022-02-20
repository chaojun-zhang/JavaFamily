package 算法.数组

object LeastNums {

  def apply(value: Array[Int]) = {

    for (i <- value.indices) {
      for (j <- 0 until value.length - 1 - i) {
        val num1 = value(j).toString + value(j + 1).toString
        val num2 = value(j + 1).toString + value(j).toString
        if (num1 > num2) {
          swap(value, j, j + 1)
        }
      }
    }
    value.mkString("")
  }

  def swap(value: Array[Int], i: Int, j: Int): Unit = {
    val tmp = value(i)
    value(i) = value(j)
    value(j) = tmp
  }

}
