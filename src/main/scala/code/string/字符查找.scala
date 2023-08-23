package code.string

object 字符查找 {

  def apply(haystack:String,needle:String):Int ={
    if (haystack==null || needle==null) return -1
    val a = haystack.length
    val b = needle.length
    if (a==0 || b==0 || b>a) return -1

    haystack.indexOf(needle)

    if (haystack.equals(needle)) return 0

    for (i<-0 until a-b){
      if (haystack.substring(i,b-a).equals(needle)) return i
    }
    -1
  }

}
