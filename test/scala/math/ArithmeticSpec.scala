package math
import org.scalatest.funsuite.AnyFunSuite

  class ArithmeticSpec extends AnyFunSuite {

    val arithmetic = new Arithmetic()

    test("Add two numbers") {
      val result = arithmetic.add(5, 4)
      val expectedResult = 9
      assert(result === expectedResult)
    }



    test("Add two numbers where numbers are negative") {
      val result = arithmetic.add(-5, -4)
      val expectedResult = -9
      assert(result === expectedResult)
    }



    test("Add two numbers where numbers are zero") {
      val result = arithmetic.add(0, 0)
      val expectedResult = 0
      assert(result === expectedResult)
    }


}
