package math

class ListExercise {

  def findMax(list : List[Int]) : Int ={
    //find max element using foldLeft
    if(list.isEmpty) java.lang.Integer.MIN_VALUE
    else list.foldLeft(list.head){(max, no) => if(max > no) max else no}
  }

  def reverse(list:List[Int]):List[Int]={
    //reverse the list using foldLeft
    list.foldLeft(List[Int]()){(acc, ele) => ele :: acc }
  }

  def duplicate(list:List[Int]):List[Int]={
    //Remove duplicate element from List

    list.foldLeft(List[Int]()){(acc, ele) => if(!acc.contains(ele)) acc :+ ele else acc}

  }

}
