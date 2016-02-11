package Week2

object sheet1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(135); 
  def product(f:Int => Int) (a:Int, b:Int):Int ={
    if(a>b) 1 else return f(a) * product(f)(a+1,b)
  };System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(21); val res$0 = 
  product(x=>x)(3,7);System.out.println("""res0: Int = """ + $show(res$0));$skip(48); 
  
  def fact(n:Int):Int = product(x => x)(1,n);System.out.println("""fact: (n: Int)Int""");$skip(10); val res$1 = 
  fact(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(100); 
  
  def sum(f:Int => Int) (a:Int, b:Int):Int ={
    if(a>b) 0 else return f(a) + sum(f)(a+1,b)
  };System.out.println("""sum: (f: Int => Int)(a: Int, b: Int)Int""");$skip(17); val res$2 = 
  sum(x=>x)(3,7);System.out.println("""res2: Int = """ + $show(res$2));$skip(230); 
  
  //Generalizing sum and product functions
  def mapreduce (f:Int => Int, combine:(Int,Int)=>Int, unitValue:Int) (a:Int, b:Int):Int = {
  	if(a>b) unitValue  else return combine(f(a),mapreduce(f,combine,unitValue) (a+1,b))
  };System.out.println("""mapreduce: (f: Int => Int, combine: (Int, Int) => Int, unitValue: Int)(a: Int, b: Int)Int""");$skip(87); 
   
  def newproduct(f:Int => Int) (a:Int, b:Int):Int = mapreduce(f,(x,y)=>x*y,1)(a,b);System.out.println("""newproduct: (f: Int => Int)(a: Int, b: Int)Int""");$skip(24); val res$3 = 
  newproduct(x=>x)(3,7);System.out.println("""res3: Int = """ + $show(res$3))}
                                             
}
