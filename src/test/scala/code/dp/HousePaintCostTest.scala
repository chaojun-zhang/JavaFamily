package code.dp

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HousePaintCostTest extends FunSuite{

  test("HouseMinTest"){
    println (HousePaintCost(Array(Array(17,2,17),Array(16,16,5),Array(14,3,19))))
  }
}
