package Week2

object sheet1 {
  def product(f:Int => Int) (a:Int, b:Int):Int ={
    if(a>b) 1 else return f(a) * product(f)(a+1,b)
  }                                               //> product: (f: Int => Int)(a: Int, b: Int)Int
  product(x=>x)(3,7)                              //> res0: Int = 2520
  
  def fact(n:Int):Int = product(x => x)(1,n)      //> fact: (n: Int)Int
  fact(5)                                         //> res1: Int = 120
  
  def sum(f:Int => Int) (a:Int, b:Int):Int ={
    if(a>b) 0 else return f(a) + sum(f)(a+1,b)
  }                                               //> sum: (f: Int => Int)(a: Int, b: Int)Int
  sum(x=>x)(3,7)                                  //> res2: Int = 25
  
  //Generalizing sum and product functions
  def mapreduce (f:Int => Int, combine:(Int,Int)=>Int, unitValue:Int) (a:Int, b:Int):Int = {
  	if(a>b) unitValue  else return combine(f(a),mapreduce(f,combine,unitValue) (a+1,b))
  }                                               //> mapreduce: (f: Int => Int, combine: (Int, Int) => Int, unitValue: Int)(a: In
                                                  //| t, b: Int)Int
   
  def newproduct(f:Int => Int) (a:Int, b:Int):Int = mapreduce(f,(x,y)=>x*y,1)(a,b)
                                                  //> newproduct: (f: Int => Int)(a: Int, b: Int)Int
  newproduct(x=>x)(3,7)                           //> res3: Int = 2520
                                             
}