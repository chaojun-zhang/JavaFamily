package code.hash

import scala.collection.mutable

object FourNum {
  def apply(a: Array[Int], b: Array[Int], c: Array[Int], d: Array[Int]): Int = {
    val map = new mutable.HashMap[Int, Int]()
    for (x <- a; y <- b) {
      val tmp = x + y
      map.get(tmp) match {
        case None => map.put(tmp, 1)
        case Some(x) => map.put(tmp, x + 1)
      }
    }
    var res = 0
    for (x <- c; y <- d) {
      val tmp = x + y
      map.get(0 - tmp) match {
        case Some(x) => res = res + x
        case _ =>
      }
    }
    res
  }

  def main(args: Array[String]): Unit = {
    println(FourNum(Array(1, 2), Array(-2, -1), Array(-1, 2), Array(0, 2)))
  }
}
