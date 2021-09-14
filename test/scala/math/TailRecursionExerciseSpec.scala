package math

import org.scalatest.funsuite.AnyFunSuite

class TailRecursionExerciseSpec extends AnyFunSuite{

  val tailRecursionExercise = new TailRecursionExercise()

  test("Find Max from +ve List"){
    val result = tailRecursionExercise.max(List(12, 52, 45, 69, 89))
    val expectedResult = 89

    assert(result === expectedResult)
  }

  test("Find Max from -ve List"){
    val result = tailRecursionExercise.max(List(-12, -52, -2, -45, -69, -89))
    val expectedResult = -2

    assert(result === expectedResult)
  }

  test("Find Max from null List"){
    val result = tailRecursionExercise.max(List())
    val expectedResult = java.lang.Integer.MIN_VALUE

    assert(result === expectedResult)
  }

  test("Find Reverse +ve List"){
    val result = tailRecursionExercise.reverse(List(12, 52, 45, 69, 89))
    val expectedResult = List(89, 69, 45, 52, 12)

    assert(result === expectedResult)
  }

  test("Find Reverse -ve List"){
    val result = tailRecursionExercise.reverse(List(-12, -52, -45, -69, -89))
    val expectedResult = List(-89, -69, -45, -52, -12)

    assert(result === expectedResult)
  }



  test("Remove Duplicate from +ve List"){
    val result = tailRecursionExercise.duplicate(List(12, 52, 45, 69, 89, 12, 52))
    val expectedResult = List(12, 52, 45, 69, 89)

    assert(result === expectedResult)
  }

  test("Remove Duplicate from -ve List"){
    val result = tailRecursionExercise.duplicate(List(-12, -52, -45, -69, -89, -12, -52))
    val expectedResult = List(-12, -52, -45, -69, -89)

    assert(result === expectedResult)
  }


}
