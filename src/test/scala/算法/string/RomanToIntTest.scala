package 算法.string

import code.string.罗马转数字
import org.scalatest.FunSuite
import org.junit.Assert
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
@RunWith(classOf[JUnitRunner])
class RomanToIntTest extends FunSuite{

  test("RomanToInt") {
    Assert.assertTrue(罗马转数字("III")== 3)
    Assert.assertTrue(罗马转数字("IV")== 4)
    Assert.assertTrue(罗马转数字("IX")== 9)
    Assert.assertTrue(罗马转数字("LVIII")== 58)
    Assert.assertTrue(罗马转数字("MCMXCIV")== 1994)
  }
}
