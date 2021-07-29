import scala.annotation.tailrec

object SizeOfList extends App {
  def f(arr:List[Int]):Int = {
    @tailrec
    def getSize(arr:List[Int], curSize:Int):Int = {
      arr match{
        case Nil => curSize
        case x::arr => getSize(arr,curSize+1)
      }
    }
    getSize(arr,0)
  }
}
