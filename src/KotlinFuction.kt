import kotlin.math.roundToInt

fun main(args: Array<String>)
{ var n1=12.4
  var n2 = 5.3
  var resu:Int
  resu = addNumbers(n1,n2)
    println("Results : $resu")

    var res = add(5,6)
    println(res)
    var number=250
    var results=Math.sqrt(number.toDouble())
    println("These SquareRoot of $number is $results")

    // user defined functions

    println("Print the code after the sum")
    sum()
}
fun sum(){
    var number1=20
    var number2=30
    println("Sum ="+(number1+number2))
}
fun add(number1:Int,number2:Int):Int{
    var plus=number1 + number2
    return plus
}
fun addNumbers(number3:Double,number4:Double):Int{
    val sum =number3+number4
    var sumInterger=sum.toInt()
    return sumInterger
}