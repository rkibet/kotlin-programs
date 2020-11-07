fun main(){
    val number1=20
    val number2=10
    println(number1+number2)
    println(number1-number2)
    println(number1*number2)
    println(number1/number2)
    println(number1%number2)
    val max= if (number1>number2)
    {
        println("$number1 is greater than $number2")
        number1
    }
    else
    {
        println("$number1 is less than $number2")
        number2
    }
    println("Max = $max")
    for (a in 1..50){
        println(a)
    }
    for(a in 'a'..'z'){
        println(a)
    }
}