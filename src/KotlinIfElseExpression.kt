fun main()
{
    val a =20
    val b =5
    val results= if(a>b) "$a is greater than $b" else "$a is less than $b"
    println(results)

    val c =-1
    val result1=if (c>0)
    {
        "$c Is A Positive Number"
    } else if (c<0)
    {
        "$c Is A Negative Number"
    }
    else
    {
        "$c Is 0"
    }
    println(result1)

    val num1=25
    val num2=20
    val num3=30
    val result2 =if(num1<num2) {
        val max = if(num1 > num3) {
            num1
        } else {
            num3
        }
        "Body of If" + max
    }else if (num2>num3){
        "Body of If else" + num2
    }
    else{
        "Body of If else" + num3
    }
    println(result2)
    }

