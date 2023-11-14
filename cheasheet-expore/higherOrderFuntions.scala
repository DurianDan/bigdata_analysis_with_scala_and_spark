def HigherSum(f: (Int) => Int)(a: Int, b: Int): Int = {
  def InnerSum(a: Int, b: Int): Int = f(a) + f(b)
  InnerSum(a, b)
}

def cube(x: Int): Int = {
  x * x * x // corrected exponentiation
}

object Main {
  def main(args: Array[String]): Unit = {
    println("HigherSum: " + HigherSum(cube)(1, 2))
  }
}
