package leetcode.string
import org.junit.Assert
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
@RunWith(classOf[JUnitRunner])
class IntToRomanTest extends FunSuite{

  test("IntToRoman") {
    Assert.assertTrue(    IntToRoman(1928) == "MCMXXVIII")
  }

}
