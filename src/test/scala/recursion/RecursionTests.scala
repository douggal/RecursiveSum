package recursion

import org.scalatest.funsuite.AnyFunSuite
import recursion.Recursion.sum

class RecursionTests extends AnyFunSuite {

    /*
    https://stackoverflow.com/questions/62679932/funsuite-missing-even-though-scalatest-is-imported
    "...FunSuite ... 3.2.0 it has been removed entirely. Hence from 3.2.0 onwards you should define like so
    import org.scalatest.funsuite.AnyFunSuite"
     */

    test("a simple case works") {
        val x = sum(List(1,2,3,4))
        assert(x == 10)
    }

    test("100 integers") {
        assertResult(5050) {
            val list = (1 to 100).toList
            sum(list)
        }
    }

    test("Empty lists evaluate to 0") {
        assert(sum(List()) == 0)
        assertResult(0) {
            val x: List[Int] = List()
            sum(x)
        }
        assertResult(0) {
            val x: List[Int] = Nil
            sum(x)
        }
    }

}

