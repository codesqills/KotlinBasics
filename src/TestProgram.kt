fun main() {
    println("Hello Kotlin");
    val details=Person("James","Cameron")
    println("FirstName is ${details.fname}")
    println("LastName is ${details.lname}")

    var myName:String?="James"
    println(myName?.length)
    //or
    if(myName!=null){
        println(myName.length)

    }
    //or
    println(myName!!.length)

}