package Week3

object rationals {
  val x = new Rational(1,2)                       //> x  : Week3.Rational = 1/2
  val y = new Rational(1,4)                       //> y  : Week3.Rational = 1/4
  x + y                                           //> res0: Week3.Rational = 3/4
  -x                                              //> res1: Week3.Rational = 1/-2
  
  val a = new Rational(1,3)                       //> a  : Week3.Rational = 1/3
  val b = new Rational(5,7)                       //> b  : Week3.Rational = 5/7
  val c = new Rational(3,2)                       //> c  : Week3.Rational = 3/2
  a-b-c                                           //> res2: Week3.Rational = -79/42
  
  val m = new Rational(1,3)                       //> m  : Week3.Rational = 1/3
  val n = new Rational(2,9)                       //> n  : Week3.Rational = 2/9
  m < n                                           //> res3: Boolean = false
  m.max(n)                                        //> res4: Week3.Rational = 1/3
  a.max(b)                                        //> res5: Week3.Rational = 5/7
  
  //val invalid = new Rational(1,0)
   new Rational(3)                                //> res6: Week3.Rational = 3/1
}

class Rational (x:Int, y:Int){

	require(y !=0 , "Denominator must be non-zero!")
	
	//second constructor
	def this(x:Int) = this(x,1)
	
	private def gcd(a:Int,b:Int) : Int = if(b==0) a else gcd(b,a%b)
	private val g = gcd(x,y)
	val num = x/g
	val den = y/g
	
	def + (that:Rational) = {
		new Rational(num*that.den+that.num*den,den*that.den)
	}
	
	def - (that:Rational) = this + -that
	
	def unary_- = new Rational(0-num,den)
	
	def < (that:Rational) = num*that.den < that.num*den
	
	def max (that:Rational) = if(this < that) that else this
	
	override def toString = num+"/"+den
}