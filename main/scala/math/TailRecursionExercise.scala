package math

class TailRecursionExercise {

  def max(list: List[Int]): Int = {

    def findMax(list1: List[Int], maxval: Int): Int ={

      if(list1.isEmpty) maxval else {
        val currentVal = list1.head

        if(currentVal > maxval) findMax(list1.tail, currentVal)
        else findMax(list1.tail, maxval)
      }

    }

    if(list.isEmpty) java.lang.Integer.MIN_VALUE else findMax(list, list.head)
  }




  def reverse(list: List[Int]): List[Int] = {

    def storeReverse(list1: List[Int], revList: List[Int]): List[Int] = {

      if(list1.isEmpty) revList
      else storeReverse(list1.tail, list1.head :: revList)
    }

    storeReverse(list, List[Int]())
  }



  def duplicate(list: List[Int]): List[Int] = {

    def removeDuplicate(list1: List[Int], newList: List[Int]): List[Int] = {
      if(list1.isEmpty) newList
//      else removeDuplicate(list1.tail, if(!newList.contains(list1.head)) newList :+ list1.head)
      else{
        if(!newList.contains(list1.head)) removeDuplicate(list1.tail, newList :+ list1.head)
        else removeDuplicate(list1.tail, newList)
      }
    }

    removeDuplicate(list, List[Int]())
  }

}
