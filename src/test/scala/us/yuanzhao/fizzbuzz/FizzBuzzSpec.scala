package us.yuanzhao.fizzbuzz

import org.scalatest.FlatSpec

import scala.collection.mutable.Stack

class FizzBuzzSpec extends FlatSpec {

  val fizzBuzz = FizzBuzz

  behavior of "FizzBuzz"

  it should "pass the base case (prints the numbers from 1 to 100 and for multiples of '3' print \"Fizz\" " +
    "instead of the number and for the multiples of '5' print \"Buzz\")" in {
    val expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz " +
      "16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz " +
      "31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz 41 Fizz 43 44 FizzBuzz " +
      "46 47 Fizz 49 Buzz Fizz 52 53 Fizz Buzz 56 Fizz 58 59 FizzBuzz " +
      "61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz 71 Fizz 73 74 FizzBuzz " +
      "76 77 Fizz 79 Buzz Fizz 82 83 Fizz Buzz 86 Fizz 88 89 FizzBuzz " +
      "91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz"
    val actual = fizzBuzz.getResult()
    assert(actual == expected)
  }

  it should "return 1 for 1" in {
    val expected = "1"
    assert(FizzBuzz.getResult(1,1) == expected)
  }


  it should "return Fizz for multiples of 3" in {
    val expected = "Fizz"
    assert(FizzBuzz.getResult(3,3) == expected)
    assert(FizzBuzz.getResult(6,6) == expected)
    assert(FizzBuzz.getResult(9,9) == expected)
  }

  it should "return Buzz for multiples of 5" in {
    val expected = "Buzz"
    assert(FizzBuzz.getResult(5,5) == expected)
    assert(FizzBuzz.getResult(10,10) == expected)
    assert(FizzBuzz.getResult(15,15).contains(expected))
  }

  it should "return FizzBuzz for 15" in {
    val expected = "FizzBuzz"
    assert(FizzBuzz.getResult(15,15) == expected)
  }


  it should "pass if end > before" in {
    val expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz"
    val actual = fizzBuzz.getResult(10, 1)
    assert(actual == expected)
  }

  it should "pass if end is not given" in {
    val expected = "91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz"
    val actual = fizzBuzz.getResult(91)
    assert(actual == expected)
  }

  it should "pass for large end value" in {
    val expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz " +
      "16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz " +
      "31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz 41 Fizz 43 44 FizzBuzz " +
      "46 47 Fizz 49 Buzz Fizz 52 53 Fizz Buzz 56 Fizz 58 59 FizzBuzz " +
      "61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz 71 Fizz 73 74 FizzBuzz " +
      "76 77 Fizz 79 Buzz Fizz 82 83 Fizz Buzz 86 Fizz 88 89 FizzBuzz " +
      "91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz"
    val actual = fizzBuzz.getResult(1, 10000)
    assert(actual == expected)
  }

  it should "pass if end is negative" in {
    val expected = "1"
    val actual = fizzBuzz.getResult(1, -10)
    assert(actual == expected)
  }


  it should "pass if start and end are named params" in {
    val expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz " +
      "16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz " +
      "31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz 41 Fizz 43 44 FizzBuzz " +
      "46 47 Fizz 49 Buzz Fizz 52 53 Fizz Buzz 56 Fizz 58 59 FizzBuzz " +
      "61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz 71 Fizz 73 74 FizzBuzz " +
      "76 77 Fizz 79 Buzz Fizz 82 83 Fizz Buzz 86 Fizz 88 89 FizzBuzz " +
      "91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz"
    val actual = fizzBuzz.getResult(end = 100, start = 1)
    assert(actual == expected)
  }

  it should "pass if both start and end are negative" in {
    val expected = "1"
    val actual = fizzBuzz.getResult(-10, -1)
    assert(actual == expected)
  }

  it should "pass if start is not given" in {
    val expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz"
    val actual = fizzBuzz.getResult(end = 10)
    assert(actual == expected)
  }

  it should "pass if start is negative" in {
    val expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz"
    val actual = fizzBuzz.getResult(-1, 10)
    assert(actual == expected)
  }






}