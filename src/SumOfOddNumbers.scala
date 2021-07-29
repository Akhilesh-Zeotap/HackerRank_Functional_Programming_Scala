import scala.annotation.tailrec
object SumOfOddNumbers extends App {
  def f(arr:List[Int]):Int = {
    @tailrec
    def getSumOdd(arr:List[Int], curSum:Int):Int = {
      arr match{
        case Nil => curSum
        case x::arr =>
          if(x%2 != 0)    getSumOdd(arr,curSum+x)
          else    getSumOdd(arr,curSum)
      }
    }
    getSumOdd(arr,0)
  }
}
