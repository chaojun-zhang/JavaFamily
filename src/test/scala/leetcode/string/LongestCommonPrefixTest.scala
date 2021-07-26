package leetcode.string
import org.junit.Assert
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class LongestCommonPrefixTest extends FunSuite {

  test("LongestCommonPrefix"){
    Assert.assertTrue(LongestCommonPrefix(Array("abc","abcde","abcdf"))=="abc")
    Assert.assertTrue(LongestCommonPrefix(Array("flower","flow","flight"))=="fl")
    Assert.assertTrue(LongestCommonPrefix(Array("dog","racecar","car"))=="")
  }
}
