package expression

fun main() {
    //expression
    val a=20
    val b=30
    val c=10
    if(a>b && a>c){
        println("$a is greatest")
    }
    else if(b>c){
        println("$b is greatest")
    }
    else {
        println("$c is greatest")
    }

    var max1=if(a>b)a else b
    var max2=if(b>c)b else c

    println("Maximum of $a and $b is $max1")
    println("Maximum of $b and $c is $max2")
}