fun main()
{
    println("Please Enter A Number Between 1-7")
    var number :Int=Integer.valueOf(readLine())
    var providedNumber = when(number){
        1->"One"
        2->"Two"
        3->"Three"
        4->"Four"
        5->"Five"
        6->"Six"
        7->"Seven"
           else->"Invalid number It Is Not Between (1 - 7)"
    }
    println("You Provide Number : $providedNumber")

    when(number){
        1-> println("One")
        2-> println("Two")
        3-> println("Three")
        4-> println("Four")
        5-> println("Five")
        6-> println("Six")
        7-> println("Seven")
        8-> println("Eight")
        9-> println("Nine")
        10-> println("Ten")
        else-> println("Invalid Number Not Between 1-10")
    }
    when(number){
        2,3,4,5,6-> println("Its Summer Season")
        7,8,9-> println("Its Rainy Season")
        10,11-> println("Its Autum Season")
        12,1,2-> println("Its Winter Season")
        else-> println("Invalid output")
    }
    when(number){
        in 1..5-> println("The numbers are between 1-5")
        in 6..10-> println("The numbers are between 6-10")
        in 11..25-> println("The numbers are between 11-25")
        in 26..50-> println("The numbers are between 26-50")
        else-> println("Number not between 1 - 50")

    }
}