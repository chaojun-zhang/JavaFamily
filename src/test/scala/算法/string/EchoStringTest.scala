package 算法.string

import 算法.字符串.回文字符串
import org.junit.Assert
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
@RunWith(classOf[JUnitRunner])
class EchoStringTest extends FunSuite  {
  test("EchoString") {
    Assert.assertFalse(回文字符串.isEchoString(Nil))
    Assert.assertFalse(回文字符串.isEchoString("sd".toList))
    Assert.assertTrue(回文字符串.isEchoString("s".toList))
    Assert.assertTrue(回文字符串.isEchoString("ss".toList))
    Assert.assertTrue(回文字符串.isEchoString("sds".toList))
    Assert.assertTrue(回文字符串.isEchoString("abcdedcba".toList))
  }
}

