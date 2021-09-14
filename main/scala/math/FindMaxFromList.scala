package math

class FindMaxFromList {

  def max(list:List[Int]):Int={
    def findmax(list1: List[Int], maxno: Int): Int ={
      val current = list1.head

      if(current < maxno) findmax(list1.tail, maxno)
      else findmax(list1.tail, current)
    }

    if (list.isEmpty) java.lang.Integer.MIN_VALUE else findmax(list, list.head)
  }

}
