package operators

fun main() {
    val x=100
    val y=200
    println(true.not())
    println(false.not())
    println("${x<y && y>100}")
    println("${x<y || y>100}")
}