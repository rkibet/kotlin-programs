/*
* Author:Ronald Kibet
* */
fun main(args:Array<String>)
 {
// input Number in array
     val numbersArray = arrayOf(1,2,3,4,5,6,7,8,9,0)

     //The list of input Numbers
     val listOfNumbers = numbersArray.toList()

     //The map of input Numbers
     val inputValues = listOfNumbers.map { i->i }

     //the square of list of numbers
     val squareOfInputValues =numbersArray.map { i: Int -> i*i }

     //mapping numbers to their square
     val mapArrays=inputValues.zip(squareOfInputValues).toMap()

     // Display the Input Values
     println(inputValues)

     // Display Square of the Input Values

     println(squareOfInputValues)
     //Displaying the array of numbers and its square
     println(mapArrays)
 }