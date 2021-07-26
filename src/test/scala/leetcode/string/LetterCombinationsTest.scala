package leetcode.string
import org.junit.Assert
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class LetterCombinationsTest extends FunSuite {

  test("LetterCombinations") {
    Assert .assertEquals(LetterCombinations("23"),List("ad","ae","af","bd","be","bf","cd","ce","cf"))
    Assert .assertEquals(LetterCombinations(""),List())
    Assert .assertEquals(LetterCombinations("2"),List("a","b","c"))
  }
}
