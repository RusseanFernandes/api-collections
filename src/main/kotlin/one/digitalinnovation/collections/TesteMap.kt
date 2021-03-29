package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String,Double> = Pair("João",2000.2)
    val map1 = mapOf(pair)

    map1.forEach { (h, v) -> println("Chave: $h - Valor $v") }

    val map2 = mapOf(
        "Pedro" to 3000.0,
        "Maria" to 1500.0,
        "José" to 2650.0
    )
    println("----------------")
    map2.forEach { (h, v) -> println("Chave: $h - Valor $v") }
}