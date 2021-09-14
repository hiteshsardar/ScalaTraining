package math

import org.scalatest.funsuite.AnyFunSuite

class FindMaxFromListSpec extends AnyFunSuite{

  val findMaxFromList = new FindMaxFromList()

  test("Find max from +ve nos") {
    val result = findMaxFromList.max(List(5, 4, 8, 99, 109, 22, 66))
    val expectedResult = 109
    assert(result === expectedResult)
  }



  test("Find max from -ve nos") {
    val result = findMaxFromList.max(List(-5, -4, -8, -99, -109, -22, -66))
    val expectedResult = -4
    assert(result === expectedResult)
  }



  test("Find max from null List") {
    val result = findMaxFromList.max(List())
    val expectedResult = java.lang.Integer.MIN_VALUE
    assert(result === expectedResult)
  }

}
