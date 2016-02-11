package Week2

object exercise {
  def product(f:Int => Int) (a:Int, b:Int):Int ={
    if(a>b) 1 else return f(a) * product(f)(a+1,b)
  }
  product(x=>x)(3,7)
}