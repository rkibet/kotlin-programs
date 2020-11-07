/*

*Author : Ronald Kibet
*
* Email :ronkibet2012@gmail.com
*
* WhatsUp Number : +254-754-00-00-20
*
*/
   //creating class Person
open class Person (_ageOfUser:Int,_nameOfUser:String)
{
    //member variables of the class

     var ageOfUser:Int
     var  nameOfUser:String

    //Initializer Block
         init {
             this.ageOfUser=_ageOfUser
             this.nameOfUser=_nameOfUser
         }
    //member function
    fun personDetails()
    {
         println("My Name Is $nameOfUser And I Am $ageOfUser Years Old")
    }
}

//create class Student that inherit from class person
class Student(school:String) : Person (27,"Ronald")
{
    var mySchool:String
    init {
        this.mySchool=school
    }
   fun studentDetails(){
      println("My Name Is $nameOfUser And I Am $ageOfUser Years Old And I am Studying in ${mySchool}chool")
   }
}
fun main()
{
    val personObject =Person(27,"Ronald Kibet")
    val studentDetails =Student("Jomo Kenyattaa University Of Science And Technology")

    //Displaying Person Details
    personObject.personDetails()

    //Displaying Student Details
    studentDetails.studentDetails()


}