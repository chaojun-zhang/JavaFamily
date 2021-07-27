package leetcode.string
import org.junit.Assert
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
@RunWith(classOf[JUnitRunner])
class ValidStringTest extends FunSuite {
  test("ValidString") {

    Assert.assertTrue(ValidString("()"))
    Assert.assertTrue(ValidString("()[]{}"))
    Assert.assertFalse(ValidString("(]"))
    Assert.assertFalse(ValidString("([)]"))
    Assert.assertTrue(ValidString("{[]}"))
    Assert.assertFalse(ValidString("(])"))


  }

}
