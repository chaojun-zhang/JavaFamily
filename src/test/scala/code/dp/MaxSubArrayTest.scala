package code.dp

import org.scalatest.FunSuite
import org.junit.Assert
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
@RunWith(classOf[JUnitRunner])
class MaxSubArrayTest extends FunSuite{

  test("MaxSubArray"){
    println(MaxSubArray(Array(-2,1,-3,4,-1,2,1,-5,4)))
    println(MaxSubArray(Array(1)))
  }
}
