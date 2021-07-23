package leetcode.string

import org.junit.Assert
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
@RunWith(classOf[JUnitRunner])
class EchoStringTest extends FunSuite  {
  test("EchoString") {
    Assert.assertFalse(EchoString.isEchoString(Nil))
    Assert.assertFalse(EchoString.isEchoString("sd".toList))
    Assert.assertTrue(EchoString.isEchoString("s".toList))
    Assert.assertTrue(EchoString.isEchoString("ss".toList))
    Assert.assertTrue(EchoString.isEchoString("sds".toList))
    Assert.assertTrue(EchoString.isEchoString("abcdedcba".toList))
  }
}

