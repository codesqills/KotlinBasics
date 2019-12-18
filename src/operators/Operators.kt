package operators

fun main() {

    println("Enter Number1: ")
    val num1= readLine()?.toInt()
    println("Enter Number2: ")
    val num2= readLine()?.toInt()
    println("Enter Operation(ADD,SUB,MUL,DIV,MOD): ")
    val operation:String= readLine().toString()

    val result=calculate(num1,num2,operation)
    println(" The result is $result")
}

fun calculate(num1: Int?, num2: Int?, operation: String): Int? {

   return when(operation){
        "ADD" -> (num1?.plus(num2!!))
       "SUB" -> (num1?.minus(num2!!))
       "MUL" -> (num1?.times(num2!!))
       "DIV" -> (num1?.div(num2!!))
       "MOD" -> (num1?.rem(num2!!))
       else -> 0
    }
}
