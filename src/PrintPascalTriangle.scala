import scala.annotation.tailrec

object PrintPascalTriangle extends App {

  def printPascal(n:Int):Unit = {

    @tailrec
    def createNewRow(prev:List[Int], next:List[Int]):List[Int] = {
      prev match {
        case x::y::arr => createNewRow(prev.tail,(next:+(x+y)))
        case _=> next:+1
      }
    }

    @tailrec
    def help(old:List[Int], n:Int):Unit = {
      if(old.size == n){
        println(old.mkString(" "))
      }
      else{
        println(old.mkString(" "))
        help(createNewRow(old,List(1)),n)
      }
    }

    help(List(1),n)

  }

  var n = scala.io.StdIn.readInt();
  printPascal(n)
}
