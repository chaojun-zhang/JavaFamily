package 算法.string

import code.backtrace.括号生成
import org.junit.Assert
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class GenerateParenthesisTest extends FunSuite{

  test("GenerateParenthesisTest"){
    println(括号生成(3))
  }
}
