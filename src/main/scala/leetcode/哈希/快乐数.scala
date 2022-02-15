package leetcode.哈希

import scala.collection.mutable

//使用哈希判断是否重复
case class HappyNum( num: Int) {
  def nextNum(n: Int) = {
    var res = 0
    var x = n
    while (x > 0) {
      val rem = x % 10
      x = x / 10
      res += rem * rem
    }
    res
  }

  def apply(): Boolean = {
    var tmp = num
    val seen = new mutable.HashSet[Int]()
    while (tmp !=1 && ! seen.contains(tmp)) {

      seen.add(tmp)
      tmp = nextNum(tmp)
    }
    tmp ==1
  }

}

case class HappyNum2(num:Int){
  def nextNum(n: Int) = {
    var res = 0
    var x = n
    while (x > 0) {
      val rem = x % 10
      x = x / 10
      res += rem * rem
    }
    res
  }

  def apply():Boolean = {
    var slow = num
    var fast = nextNum(num)
    while (fast != 1 && slow != fast){
      slow = nextNum(slow)
      fast = nextNum(nextNum(fast))
    }

    fast == 1

  }
}

object HappyNum {
  def main(args: Array[String]): Unit = {
    println(HappyNum(19)())
    println(HappyNum(190)())
    println(HappyNum(2)())

    println(HappyNum2(19)())
    println(HappyNum2(190)())
    println(HappyNum2(2)())
  }
}