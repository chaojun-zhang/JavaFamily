package 算法.string

import code.string.数字转罗马
import org.junit.Assert
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
@RunWith(classOf[JUnitRunner])
class IntToRomanTest extends FunSuite{

  test("IntToRoman") {
    Assert.assertTrue(    数字转罗马(1928) == "MCMXXVIII")
  }

}
