package 算法.string

import 算法.动态规划.LongestIncreasedString
import org.junit.Assert
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
@RunWith(classOf[JUnitRunner])
class LongestIncreaseStringTest extends FunSuite{

  test("LongestIncreaseStringTest"){
    Assert.assertTrue( LongestIncreasedString(Array(10,9,2,5,3,7,101,18))==4)
    Assert.assertTrue( LongestIncreasedString(Array(0,1,0,3,2,3))==4)
    Assert.assertTrue( LongestIncreasedString(Array(7,7,7,7,7))==1)

  }
}
