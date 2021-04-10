object Basics extends App{
  //define values have a regular data types with capitalize
  val meaningOfLife: Int = 42// immutable value
  val gay = false
  var age: Int = 23 // mutable value

  // string and string operations
  val aString = "I love programming "
  val aComposedString = aString + " in" + " "+ "any programming language"
  val anInterpolatedString = s"The meaning of life is $meaningOfLife"
  val aMultiLineString =
    """
      |
      |""".stripMargin
  // expression = structure that can be reduced to a value
  // every thing can be an expression
  val anExpression = 2 + 3

  // if-expression
  val ifExpression = if (meaningOfLife>43 ) 56 else 999// in lambda expression meaningOfLife > 43 : 56 : 999
  // a chained if-expression
  val chainedIfExpression=
    if(meaningOfLife>43) 56
    else if (meaningOfLife<0) -2
    else if (meaningOfLife>999) 78
    else 0

  // code blocks
  val codeBlocks = {
    //definition if could be {local variables, function, class, expression, another code block
    val aLocalBlockValue = 67
    //in the end of block you should return the value of the block
    aLocalBlockValue + 3
  }

  // define a function
  def firsFunction(x: Int, y: String): String = {
    y + " " + x
  }
  // a factorial function
  def factorialFunction(x : Int): Int ={
    if(x <=1) 1
    else x* factorialFunction(x-1)
  }
/*********************************************************/
/**      Programming Note form Scala Developers         **/
/** we don't user loops or iteration, we user recursion **/
/*********************************************************/

  // unit types = no meaningful value === "void"
  // type of SIDE EFFECTS (operation that have doesn't nothing to do with computing)
  print("ha ha")
  // function returning a unit
  def myReturningUnitFunction(): Unit={
    println("i don't like to returning Units")
  }
  // a variable
  val myUnit: Unit = {}

  // dealing with list
  val myList = List.range(10,30)
  val newList = myList.map(x=> x+1).map(x=> x%2==0)

  newList.foreach(println)

  // mapping item tubule and filtering
  val list2 = myList.map(x=>(x*2,3)).filter(x=> x._1>25)
  list2.foreach(println)

}
