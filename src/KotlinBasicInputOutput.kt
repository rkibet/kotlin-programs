fun main(args:Array<String>)
{
  println("Enter Your Name")
    var name = readLine()
    println("Enter Your Age")
    var age:Int=Integer.valueOf(readLine())
    println("Your Age Is $name And Is $age")
    println("Enter Number One")
    var numberOne:Int=Integer.valueOf(readLine())
    println("Enter Number One")
    var numberTwo:Int=Integer.valueOf(readLine())

    var results=numberOne + numberTwo

    println("The Sum Of $numberOne And $numberTwo Is : $results")
}