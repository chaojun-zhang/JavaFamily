package code.dp

import org.scalatest.FunSuite


import org.junit.Assert
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
@RunWith(classOf[JUnitRunner])
class MaxProductTest extends FunSuite{

  test("MaxProduct" ){
   println( MaxProduct.maxProduct(Array(2,3,-2,4)))
  }
}
