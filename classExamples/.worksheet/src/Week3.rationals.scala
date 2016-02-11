package Week3

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  val x = new Rational(1,2);System.out.println("""x  : Week3.Rational = """ + $show(x ));$skip(28); 
  val y = new Rational(1,4);System.out.println("""y  : Week3.Rational = """ + $show(y ));$skip(8); val res$0 = 
  x + y;System.out.println("""res0: Week3.Rational = """ + $show(res$0));$skip(5); val res$1 = 
  -x;System.out.println("""res1: Week3.Rational = """ + $show(res$1));$skip(31); 
  
  val a = new Rational(1,3);System.out.println("""a  : Week3.Rational = """ + $show(a ));$skip(28); 
  val b = new Rational(5,7);System.out.println("""b  : Week3.Rational = """ + $show(b ));$skip(28); 
  val c = new Rational(3,2);System.out.println("""c  : Week3.Rational = """ + $show(c ));$skip(8); val res$2 = 
  a-b-c;System.out.println("""res2: Week3.Rational = """ + $show(res$2));$skip(31); 
  
  val m = new Rational(1,3);System.out.println("""m  : Week3.Rational = """ + $show(m ));$skip(28); 
  val n = new Rational(2,9);System.out.println("""n  : Week3.Rational = """ + $show(n ));$skip(8); val res$3 = 
  m < n;System.out.println("""res3: Boolean = """ + $show(res$3));$skip(11); val res$4 = 
  m.max(n);System.out.println("""res4: Week3.Rational = """ + $show(res$4));$skip(11); val res$5 = 
  a.max(b);System.out.println("""res5: Week3.Rational = """ + $show(res$5));$skip(58); val res$6 = 
  
  //val invalid = new Rational(1,0)
   new Rational(3);System.out.println("""res6: Week3.Rational = """ + $show(res$6))}
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
