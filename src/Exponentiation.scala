import scala.annotation.tailrec

object Exponentiation{
  @tailrec
  def getExponentiation(num:Double, denom:Double, itr:Int, x:Double, ans:Double):Double = {
    itr match {
      case 11 => ans
      case _ => getExponentiation(num*x,denom*itr,itr+1,x,ans+num/denom)
    }
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    for (nItr <- 1 to n) {
      val x = stdin.readLine.trim.toDouble
      println(getExponentiation(1,1,1,x,0))
    }
  }
}
