package tailrecursion

object TailRecursiveSum extends App {

  def sum(list: List[Int]): Int = {
    sumWithAccumulator(list, 0)
  }

  def sumWithAccumulator(list: List[Int], acc: Int): Int = {
    list match {
      case Nil => {
        val stackTraceArray = Thread.currentThread.getStackTrace
        stackTraceArray.foreach(println)
        acc
      }
      case x :: xs => sumWithAccumulator(xs, acc)
    }
  }

  val lst = (1 to 10).toList

  val s = sum(lst)

}
