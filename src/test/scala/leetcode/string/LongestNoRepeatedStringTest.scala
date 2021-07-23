package leetcode.string

import org.junit.Assert
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class LongestNoRepeatedStringTest  extends FunSuite{

  test("longest common string") {
    Assert.assertTrue(LongestNoRepeatedString("abca")==3)
    Assert.assertTrue(LongestNoRepeatedString("abcdef")==6)
    Assert.assertTrue(LongestNoRepeatedString("abcdefa")==6)
  }

}
