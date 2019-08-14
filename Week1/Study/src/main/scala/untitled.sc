
  def abs(x: Double) = if (x < 0) -x else x


  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) < (x / 1000000)

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def sqrt(x: Double) = sqrtIter(1.0, x)


  sqrt(2)
  sqrt(4)
  sqrt(81)
  sqrt(1e-10)
  sqrt(1e60)


  Double.MaxValue
  isGoodEnough( improve(1.0, 1e60), 1e60)
  improve(1.0, 1e60)
  improve(1.0, 1e60)
  (improve(1.0, 1e60) + 1e60 / improve(1.0, 1e60)) / 2