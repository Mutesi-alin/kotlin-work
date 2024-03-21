//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
 //Write a program that prompts the user to enter two numbers and prints their sum, difference, product, and quotient.
 var a = 25
 var b = 5
 println(a+b)
 println(a-b)
 println(a*b)
 println(a%b)





var newbooks = Books("yellow sun","mutesi","1999")
 newbooks.libray()

 //Write a program that calculates the area of a rectangle. The user should be prompted to enter the length and width of the rectangle.


 var length= 12
 var width= 4
 var  area= length * width
 println(area)
 //

  // Write a program that converts temperature from Celsius to Fahrenheit. The user should be prompted to enter the temperature in Celsius.





var newarea= Rectangle(34.56,67.4)
 newarea.area()

 var accounts=BankAccount(4,67.0,"Mutesi Aline")

 accounts.deposit(56.0)
 accounts.withdraw(34.0)
 accounts.properties()







}

class Books(var title:String,var author:String,var publicationYear:String){

 fun libray(){
  println("title:$title")
  println("author:$author")
  println("publicationYear:$publicationYear")
 }
}

class Rectangle(var width:Double,var length:Double){

 fun area (){
  var formular= length*width

  println("formula:$formular")

 }


}

class BankAccount(var number:Int,var balance:Double,var accountholder:String){




 fun deposit(amount:Double){
  balance += amount
          println("hello $accountholder your new $balance $amount ")


 }
 fun withdraw(amount: Double) {
  if (balance >= amount) {
   balance -= amount
   println("Hello $accountholder your have withdraw $amount your new $balance is $amount")
  } else {
   println("insuffiecent  $amount ")

  }
 }

  fun properties(){
   println("numbers:$number")
   println("balance:$balance")
   println("accountholder:$accountholder")
  }









}







































