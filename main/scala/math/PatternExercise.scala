package math

class PatternExercise {

  def max(list: List[Int]): Int = {
    def findMax(list1: List[Int], maxVal: Int): Int = {
      list1 match {
        case List() => maxVal
        case h::t if list1.head < maxVal => findMax(list1.tail, maxVal)
        case _ => findMax(list1.tail, list1.head)
      }
    }
    if(list.isEmpty) java.lang.Integer.MIN_VALUE else findMax(list, list.head)
  }



  def reverse(list: List[Int]): List[Int] = {
    def storeReverse(list1: List[Int], reverseList: List[Int]): List[Int] = {
      list1 match {
        case List() => reverseList
        case h::t => storeReverse(list1.tail, list1.head :: reverseList)
        case _ => storeReverse(list1.tail, reverseList)
      }
    }
    storeReverse(list, List[Int]())
  }



  def duplicate(list: List[Int]): List[Int] = {
    def removeDuplicate(list1: List[Int], duplicateList: List[Int]): List[Int] ={
      list1 match {
        case List() => duplicateList
        case h :: t if !duplicateList.contains(list1.head) => removeDuplicate(list1.tail, duplicateList :+ list1.head)
        case _ => removeDuplicate(list1.tail, duplicateList)
      }
    }
    removeDuplicate(list, List[Int]())
  }

}
