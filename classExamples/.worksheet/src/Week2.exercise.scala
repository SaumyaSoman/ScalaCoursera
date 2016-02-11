package Week2

object exercise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(137); 
  def product(f:Int => Int) (a:Int, b:Int):Int ={
    if(a>b) 1 else return f(a) * product(f)(a+1,b)
  };System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(21); val res$0 = 
  product(x=>x)(3,7);System.out.println("""res0: Int = """ + $show(res$0))}
}
