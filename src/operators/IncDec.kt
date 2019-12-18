package operators

fun main() {
    var a=100
    var b=200
    println(a.inc())
    println(a.dec())

    println("a++ ${a++}")//100
    println("++a ${++a}")//102
    println("b-- ${b--}")//200
    println("--b ${--b}")//198
}