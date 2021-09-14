package math

import org.scalatest.funsuite.AnyFunSuite

class ListExerciseSpec extends AnyFunSuite{

  val listExercise = new ListExercise()

  test("Find max from +ve nos") {
    val result = listExercise.findMax(List(5, 4, 8, 99, 109, 22, 66))
    val expectedResult = 109
    assert(result === expectedResult)
  }

  test("Find max from -ve nos") {
    val result = listExercise.findMax(List(-5, -4, -8, -99, -109, -22, -66))
    val expectedResult = -4
    assert(result === expectedResult)
  }

  test("Find max from null List") {
    val result = listExercise.findMax(List())
    val expectedResult = java.lang.Integer.MIN_VALUE
    assert(result === expectedResult)
  }



  test("Reverse +ve"){
    val result = listExercise.reverse(List(1, 5, 6 , 8))
    val expextedResult = List(8, 6, 5, 1)
    assert(result === expextedResult)
  }

  test("Reverse -ve"){
    val result = listExercise.reverse(List(-1, -5, -6 , -8))
    val expextedResult = List(-8, -6, -5, -1)
    assert(result === expextedResult)
  }



  test("Duplicate +ve"){
    val result = listExercise.duplicate(List(1, 5, 6 , 8, 1, 6))
    val expextedResult = List(1, 5, 6, 8)
    assert(result === expextedResult)
  }

  test("Duplicate -ve"){
    val result = listExercise.duplicate(List(-1, -5, -6 , -8, -1, -6))
    val expextedResult = List(-1, -5, -6, -8)
    assert(result === expextedResult)
  }

}
