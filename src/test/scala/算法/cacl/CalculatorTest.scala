package 算法.cacl

import 算法.计算器.{Calculator}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CalculatorTest extends FunSuite {

  test("Calculator") {
    println(Calculator("2+(3*5)"))
    println(Calculator("2*(5-3)"))
    println(Calculator("2*(5-3)*6-5*(3+8) "))
    println(Calculator("2*(5-3*(6-3))*6-5*(3+8)"))
  }
}
