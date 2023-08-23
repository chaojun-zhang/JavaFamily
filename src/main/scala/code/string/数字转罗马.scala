package code.string

object 数字转罗马 {

  /**
   * 建立字典映射罗马面值和数字，然后算法类似找钱的思路
   * @param v
   * @return
   */
  def apply(v: Int): String = {

    var value = v;
    val dict = Array(
      (1000 , "M"),
      (900 , "CM"),
      (500 , "D"),
      (400 , "CD"),
      (100 , "C"),
      (90 , "XC"),
      (50 , "L"),
      (40 , "XL"),
      (10 , "X"),
      (9 , "IX"),
      (5 , "V"),
      (4 , "IV"),
      (1 , "I"))
    val sb = new StringBuilder()
    for ((v,r)<- dict){
      while (value >=v){
        value = value - v
        sb.append(r)
      }
      if (value ==0){
        return sb.toString()
      }
    }
    sb.toString
  }
}
