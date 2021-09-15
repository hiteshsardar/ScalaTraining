package math

import org.scalatest.funsuite.AnyFunSuite

class ImplicitRationalSpec extends AnyFunSuite{

  val implicitRational1 = new ImplicitRational(3, 9)
  val implicitRational2 = new ImplicitRational(5, 9)

  test("Add two Rational nos"){
    val result = implicitRational1 + implicitRational2
    val expectedResult = new ImplicitRational(72, 81)

    assert(result.denom === expectedResult.denom)
    assert(result.numer === expectedResult.numer)
  }

  test("Add Rational no with Integer"){
    val result = implicitRational1 + 12
    val expectedResult = new ImplicitRational(111, 9)

    assert(result.denom === expectedResult.denom)
    assert(result.numer === expectedResult.numer)
  }

}
