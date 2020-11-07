var count=0
fun rec(){
    count++
    if (count<=5){
        println("Hello -> "+count)
        rec();
    }
}
fun fuctorial(n:Int):Long{
    return if (n == 1)
    {
        n.toLong()
    }else{
        n*fuctorial(n-1)
    }
}
fun main()
{
    rec()
    val number = 7
    val resu :Long
    resu=fuctorial(number)
    println("Fuctorial of $number is : $resu")
}