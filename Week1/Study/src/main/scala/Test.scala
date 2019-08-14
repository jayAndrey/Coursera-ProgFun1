object Test {
  def main(args: Array[String]): Unit = {
    def abs(x: Double) = if (x < 0) -x else x


    def isGoodEnough(guess: Double, x: Double) =
    { println(abs(guess * guess - x) )
      abs(guess * guess - x) < 0.001}

    def improve(guess: Double, x: Double) =
      (guess + x / guess) / 2

    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def sqrt(x: Double) = sqrtIter(1.0, x)

    /*
      sqrt(2)
      sqrt(4)
      sqrt(81)*/
    sqrt(1e50)

  }
}
