package leetcode.string

import org.junit.Assert
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class LongestEchoStringTest extends FunSuite{
  test("longest echo string"){
    Assert.assertTrue(LongestEchoString("abcb")=="bcb")
    Assert.assertTrue(LongestEchoString("abccba")=="abccba")
    Assert.assertTrue(LongestEchoString("abcba")=="abcba")
    Assert.assertTrue(LongestEchoString("ab")=="a")
    Assert.assertTrue(LongestEchoString("aa")=="aa")
    Assert.assertTrue(LongestEchoString("abb")=="bb")
    Assert.assertTrue(LongestEchoString("a")=="a")
  }

}
