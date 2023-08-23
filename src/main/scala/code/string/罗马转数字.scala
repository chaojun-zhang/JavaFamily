package code.string

object 罗马转数字 {

  /**
   * 思路IV 就是 0-1 +5 = 4， XXIV= 10+ 10 -1 +5 = 24
   * @param value
   * @return
   */
  def apply(value:String): Int = {

    val a = Map(
      'I'->1,
      'V'->5,
      'X'->10,
      'L'->50,
      'C'->100,
      'D'->500,
      'M'->1000
    )

    var res =0
    val len = value.length
    for (i<- 0 until  value.length){
      val iv = a(value.charAt(i))
      if ((i<len -1) && a(value.charAt(i+1))>iv ){
        res = res - iv
      } else {
        res = res + iv
      }
    }
    res
  }
}
