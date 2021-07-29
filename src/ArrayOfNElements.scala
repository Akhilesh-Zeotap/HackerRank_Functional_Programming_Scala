object ArrayOfNElements extends App {
  def f(num:Int) = {
    for(i <- 0 until num) yield i
  }
  val readInt = scala.io.StdIn.readInt()
  println(f(readInt))
}
