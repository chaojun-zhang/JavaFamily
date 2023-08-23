package 算法.string

import code.dp.最长回文字符串
import org.junit.Assert
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class LongestEchoStringTest extends FunSuite{
  test("longest echo string"){
    Assert.assertTrue(最长回文字符串("abcb")=="bcb")
    Assert.assertTrue(最长回文字符串("abccba")=="abccba")
    Assert.assertTrue(最长回文字符串("abcba")=="abcba")
    Assert.assertTrue(最长回文字符串("ab")=="a")
    Assert.assertTrue(最长回文字符串("aa")=="aa")
    Assert.assertTrue(最长回文字符串("abb")=="bb")
    Assert.assertTrue(最长回文字符串("a")=="a")
  }

}
