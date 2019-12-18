package operators

fun main() {
    val a:Int=10
    val b:Int=20

    println("$a < $b ${(a.compareTo(b)<0)}")
    println("$a > $b ${(a.compareTo(b)>0)}")
    println("$a >= $b ${(a.compareTo(b)>=0)}")
    println("$a <= $b ${(a.compareTo(b)<=0)}")
    println("$a == $b ${a==b}")
    println("$a != $b ${!(a.equals(b))}")






}