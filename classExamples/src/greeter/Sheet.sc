package greeter

object Sheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	
	var x = 1                                 //> x  : Int = 1
	def increase (i: Int) = i+1               //> increase: (i: Int)Int
	println(increase(x))                      //> 2
}