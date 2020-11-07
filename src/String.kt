fun main(args:Array<String>){
    var myname:String ="Ronald"
    myname +="Kibet"
    println("$myname \$")
    var s= String()
    val str="Ronald Kibet is my name"
    println(str.length)
    s ="Ronald is my name"
    println(str.subSequence(0,10))
    println(s.compareTo(str))
    println(s.compareTo(str,true))
    println(str[0])
    println(str.get(4))
    for (elements in str){
        println(elements)
    }
}