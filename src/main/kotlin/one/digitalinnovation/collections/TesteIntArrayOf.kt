package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(4,5,6,7,1,20)

    values.forEach {
        println(it)
    }
    println("-----")

    values.sort()

    for (valor in values){
        println(valor)
    }

}