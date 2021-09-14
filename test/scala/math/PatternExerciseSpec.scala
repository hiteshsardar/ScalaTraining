package math

import org.scalatest.funsuite.AnyFunSuite

class PatternExerciseSpec extends AnyFunSuite{

  val patternExercise = new PatternExercise()

  test("Find max from +ve List"){
    val result = patternExercise.max(List(12, 52, 36, 65, 99, 45, 22))
    val expectedResult = 99

    assert(result === expectedResult)
  }

  test("Find max from -ve List"){
    val result = patternExercise.max(List(-12, -52, -36, -65, -9, -99, -45, -22))
    val expectedResult = -9

    assert(result === expectedResult)
  }

  test("Find max from null List"){
    val result = patternExercise.max(List())
    val expectedResult = java.lang.Integer.MIN_VALUE

    assert(result === expectedResult)
  }



  test("Reverse +ve List"){
    val result = patternExercise.reverse(List(12, 52, 36, 65, 99, 45, 22))
    val expectedResult = List(22, 45, 99, 65, 36, 52, 12)

    assert(result === expectedResult)
  }

  test("Reverse -ve List"){
    val result = patternExercise.reverse(List(-12, -52, -36, -65, -99, -45, -22))
    val expectedResult = List(-22, -45, -99, -65, -36, -52, -12)

    assert(result === expectedResult)
  }



  test("Remove duplicate element from the +ve List"){
    val result = patternExercise.duplicate(List(12, 52, 36, 65, 99, 45, 22, 65, 99, 12))
    val expectedResult = List(12, 52, 36, 65, 99, 45, 22)

    assert(result === expectedResult)
  }

  test("Remove duplicate element from the -ve List"){
    val result = patternExercise.duplicate(List(-12, -52, -36, -65, -99, -45, -22, -65, -99, -12))
    val expectedResult = List(-12, -52, -36, -65, -99, -45, -22)

    assert(result === expectedResult)
  }

}
