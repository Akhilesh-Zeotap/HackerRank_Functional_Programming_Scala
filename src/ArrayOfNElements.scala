object ArrayOfNElements extends App {
  def f(num:Int) : Any = {
    for(i <- 0 until num) yield i
  }
  val readInt = scala.io.StdIn.readInt()
  println(f(readInt))
}
