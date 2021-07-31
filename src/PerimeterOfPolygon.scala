import java.lang.Math;
object Solution {


  def getInput(n:Int,mp:List[List[Int]]):List[List[Int]] = {

    if(n <= 0) mp
    else{
      val tup = scala.io.StdIn.readLine().split(" ").map(_.toInt).toList;
      getInput(n-1,mp:+tup);

    }
  }

  def solve(n:Int,mp:List[List[Int]],res:Double,x:Int,y:Int): Any= {
    if(n <= 1){
      //print(x,y)
      val x1 = mp.head(0)
      val y1 = mp.head(1)
      return res+Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y))
    }
    val x1 = mp.head(0)
    val y1 = mp.head(1)
    val x2 = mp.tail.head(0)
    val y2 = mp.tail.head(1)

    solve(n-1,mp.tail,res+Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)),x,y)

  }


  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/

    var n = scala.io.StdIn.readInt();

    var list = getInput(n,List())
    //print(list)
    var x = list(0)(0)
    var y = list(0)(1)
    println(solve(n,list,0,x,y))
  }
}
