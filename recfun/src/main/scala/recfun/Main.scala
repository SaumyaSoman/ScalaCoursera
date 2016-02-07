package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if(c==0 || r==c) return 1
    return pascal(c-1,r-1) + pascal(c,r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    if(chars.isEmpty) return true    
    return isBalanced(chars,openBrackets=0)   
  }
  
  def isBalanced(chars: List[Char] , openBrackets:Int): Boolean = {
    if(chars.isEmpty) return openBrackets==0
    var x=chars.head
    if(x=='(')  isBalanced(chars.tail,openBrackets+1)
    else if(x==')') {
      return openBrackets>0 && isBalanced(chars.tail,openBrackets-1)
    }
    else  isBalanced(chars.tail,openBrackets)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if(money==0) return 1
    if(coins.isEmpty || money<0) return 0
    return countChange(money-coins.head,coins)+countChange(money,coins.tail)
    
  }
}
