package greeter

object Sheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(13); 
	
	var x = 1;System.out.println("""x  : Int = """ + $show(x ));$skip(29); 
	def increase (i: Int) = i+1;System.out.println("""increase: (i: Int)Int""");$skip(22); 
	println(increase(x))}
}
