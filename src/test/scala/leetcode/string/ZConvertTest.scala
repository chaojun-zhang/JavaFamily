package leetcode.string

import org.junit.Assert
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class ZConvertTest extends FunSuite{

  test("zconvert") {
    Assert.assertTrue( ZConvert("PAYPALISHIRING",3)== "PAHNAPLSIIGYIR")
    Assert.assertTrue( ZConvert("PAYPALISHIRING",4)== "PINALSIGYAHRPI")
    Assert.assertTrue( ZConvert("A",1)== "A")
    Assert.assertTrue( ZConvert("AB",1)== "AB")
  }
}
