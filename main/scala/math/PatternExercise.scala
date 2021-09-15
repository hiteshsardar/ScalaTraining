package math

class PatternExercise {

  def max(list: List[Int]): Int = {
    def findMax(list1: List[Int], maxVal: Int): Int = {
      list1 match {
        case List() => maxVal
        case h::t =>
          if (h < maxVal) findMax(t, maxVal)
          else findMax(t, h)
      }
    }
    if(list.isEmpty) java.lang.Integer.MIN_VALUE else findMax(list, list.head)
  }



  def reverse(list: List[Int]): List[Int] = {
    def storeReverse(list1: List[Int], reverseList: List[Int]): List[Int] = {
      list1 match {
        case List() => reverseList
        case h::t => storeReverse(t, h :: reverseList)
      }
    }
    storeReverse(list, List[Int]())
  }



  def duplicate(list: List[Int]): List[Int] = {
    def removeDuplicate(list1: List[Int], duplicateList: List[Int]): List[Int] ={
      list1 match {
        case List() => duplicateList
        case h :: t =>
          if (!duplicateList.contains(h)) removeDuplicate(t, duplicateList :+ h)
          else removeDuplicate(t, duplicateList)
      }
    }
    removeDuplicate(list, List[Int]())
  }

}
