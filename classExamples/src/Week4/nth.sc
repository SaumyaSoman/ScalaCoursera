package Week4

import List._

object nth {
  def nth[T](n: Int, list: List[T]): T = {
    if (list isEmpty) throw new IndexOutOfBoundsException
    if (n == 0) list.head
    else nth(n - 1, list.tail)
  }                                               //> nth: [T](n: Int, list: Week4.List[T])T

  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
                                                  //> list  : Week4.Cons[Int] = Week4.Cons@6b573f80
  nth(2, list)                                    //> res0: Int = 3
  nth(-1, list)                                   //> java.lang.IndexOutOfBoundsException
                                                  //| 	at Week4.nth$$anonfun$main$1.nth$1(Week4.nth.scala:7)
                                                  //| 	at Week4.nth$$anonfun$main$1.apply$mcV$sp(Week4.nth.scala:14)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at Week4.nth$.main(Week4.nth.scala:5)
                                                  //| 	at Week4.nth.main(Week4.nth.scala)
  nth(4, list)
  
}