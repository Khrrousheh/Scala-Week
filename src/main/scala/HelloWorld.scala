import scala.util.matching.Regex

object HelloWorld extends App {
  println("Hello, world")

  // standard input
//  import scala.io.StdIn._
//  val name = readLine("Input your name")
//  print(Console.BOLD)
//  println(name)
//  ///////////////////
//
//  val myList = List.range(10,30)
//  val newList = myList.map(x=> x+1).filter(x=> x%2==0)
//
//  newList.foreach(println)
//
//  // mapping item tubule and filtering
//  val list2 = myList.map(x=>(x*2,3)).filter(x=> x._1>25)
//  list2.foreach(println)
//

  val sentence = "There are more than 13 students in this class where 5 of them are above 23 years old"

  // regex object function
  val myRegex= new Regex("\\d+")
  println( myRegex replaceAllIn (sentence,"**"))

  // regex using reduce api
}
