package recursion

object Recursion extends App {

  def sum(list: List[Int]): Int = list match {
    case Nil => {
      val stackTraceArray = Thread.currentThread.getStackTrace
      //stackTraceArray.foreach(println)
      0
    }
    case x :: xs => x + sum(xs)
  }

  val lst = (1 to 10).toList

  val s = sum(lst)

}

