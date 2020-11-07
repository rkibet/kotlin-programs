fun main(){
    var marks = arrayOf(74,67,61,90,74,50,55,56,49)
    for (items in marks){
        println(items)
    }
    for (item in marks.indices){
        println("Marks[$item]"+marks[item])
        //println(item)

    }
    println(" for i in 1..10 print(i) = ")
    for(i in 1..10) print(i)
    println(" for i in 11..20 print(i) = ")
    for(i in 11..20) print(i)
    println(" for i in 21..30 print(i) = ")
    for(i in 21..30) print(i)
    println(" for i in 31..55 print(i) = ")
    for(i in 31..55) print(i)

    println("5 downto1 ")
    for(i in 5 downTo 1) print(i)
    println("5 step 1 ")
    for(i in 1..5 step 2) print(i)
    println("5 to 1 step 2 ")
    for(i in 5 downTo 1 step 2) print(i)
}