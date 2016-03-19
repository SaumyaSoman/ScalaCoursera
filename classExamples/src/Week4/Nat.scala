package Week4

abstract class Nat {
  def isZero : Boolean
  def pre  : Nat
  def succ : Nat
  def + (that:Nat) : Nat
  def - (that:Nat) : Nat
}

object Zero extends Nat{
  def isZero : Boolean =true
  def pre: Nat = throw new Error("0.pre");
  def succ: Nat = new Succ(this)
  def + (that:Nat) : Nat = that
  def - (that:Nat) : Nat = if(that.isZero) this else throw new Error("negative number")
}

class Succ(n: Nat) extends Nat{
  def isZero : Boolean =false
  def pre: Nat = n
  def succ: Nat = new Succ(this)
  def + (that:Nat) : Nat = new Succ(n+that)
  def - (that:Nat) : Nat = if(that.isZero) this else n-that.pre
}