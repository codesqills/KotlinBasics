package datatypes

fun main() {
    var myInt = 25
    var myLong = 32L
    var myFloat = 43F
    var myFloat1 = 27.9

    println("$myInt")
    println("$myLong")
    println("$myFloat")
    println("$myFloat1")

    //find the typename

    println(myFloat1.javaClass.name)
    println(myFloat1::class.java)

    var myAge = "35"
    var myAgeDetails: Int = myAge.toInt()

    var result=10+myAgeDetails
}