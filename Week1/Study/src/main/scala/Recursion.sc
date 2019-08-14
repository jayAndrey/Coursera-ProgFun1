// import

def factorial(x: Int): BigDecimal = {
  def factorial(x: Int, now: BigDecimal): BigDecimal = if (x == 1) now else factorial(x -1, now * x)
  factorial(x, 1)
}

factorial(10000)