package leetcode.string

import org.scalatest.FunSuite
import org.junit.Assert
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
@RunWith(classOf[JUnitRunner])
class RomanToIntTest extends FunSuite{

  test("RomanToInt") {
    Assert.assertTrue(RomanToInt("III")== 3)
    Assert.assertTrue(RomanToInt("IV")== 4)
    Assert.assertTrue(RomanToInt("IX")== 9)
    Assert.assertTrue(RomanToInt("LVIII")== 58)
    Assert.assertTrue(RomanToInt("MCMXCIV")== 1994)
  }
}
