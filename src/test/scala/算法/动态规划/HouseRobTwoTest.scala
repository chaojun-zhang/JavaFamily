package 算法.动态规划


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HouseRobTwoTest extends FunSuite {
  test("HouseRobTwoTest") {
    println(HouseRobTwo(Array(2, 3, 2)))
    println(HouseRobTwo(Array(1, 2, 3,1)))
    println(HouseRobTwo(Array(1, 7, 9,2)))
  }

}
