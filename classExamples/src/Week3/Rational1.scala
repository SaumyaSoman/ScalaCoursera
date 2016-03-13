package Week3

class Rational1 (x:Int, y:Int){

	require(y !=0 , "Denominator must be non-zero!")
	
	//second constructor
	def this(x:Int) = this(x,1)
	
	private def gcd(a:Int,b:Int) : Int = if(b==0) a else gcd(b,a%b)
	private val g = gcd(x,y)
	val num = x/g
	val den = y/g
	
	def + (that:Rational1) = {
		new Rational1(num*that.den+that.num*den,den*that.den)
	}
	
	def - (that:Rational1) = this + -that
	
	def unary_- = new Rational1(0-num,den)
	
	def < (that:Rational1) = num*that.den < that.num*den
	
	def max (that:Rational1) = if(this < that) that else this
	
	override def toString = num+"/"+den
}