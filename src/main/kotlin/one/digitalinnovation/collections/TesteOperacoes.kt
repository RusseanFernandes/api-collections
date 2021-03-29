package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1010.0,2400.5,1009.5)

    salarios.forEach { println(it) }
    println("------------------")
    salarios.sort()
    for (valor in salarios){
        println(valor)
    }
    println("------------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salário: ${salarios.average()}")

    val salarioMarioQue1000 = salarios.filter { it>1200 }
    println("------------------")
    salarioMarioQue1000.forEach { println(it) }

    println("------------------")
    println(salarios.count { it in 1009.7..4000.0 })
    println("------------------")
    println(salarios.find { it == 500.0 })
    println(salarios.find { it == 1009.5 })
    println("------------------")
    println(salarios.any { it == 1010.0 })
    println(salarios.any { it == 5000.0 })

}