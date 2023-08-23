package 算法.string

import code.backtrace.电话字符组合
import org.junit.Assert
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class LetterCombinationsTest extends FunSuite {

  test("LetterCombinations") {
    Assert .assertEquals(电话字符组合("23"),List("ad","ae","af","bd","be","bf","cd","ce","cf"))
    Assert .assertEquals(电话字符组合(""),List())
    Assert .assertEquals(电话字符组合("2"),List("a","b","c"))
  }
}
