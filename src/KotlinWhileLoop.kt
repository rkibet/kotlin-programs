fun main(){
    var i =100
    var a =1
    var sum =0
    while (i<=5){
        println(i)
        i++
    }
    while ( i !=0){
        sum +=i
        --i
    }
    println("Sum = $sum")

    do {
        println(a)
        a++
    }
        while (a<=5);
}