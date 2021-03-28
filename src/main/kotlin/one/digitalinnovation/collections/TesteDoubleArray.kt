package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)

    salarios[0]=2000.00
    salarios[1]=1500.00
    salarios[2]=1000.00

    salarios.forEach { println(it) }

    println("-----")

    salarios.forEachIndexed { index, valor ->
        salarios[index] = valor * 1.1
    }

    salarios.forEach { println(it) }

    println("-----")

    val salarios2 = doubleArrayOf(2500.0,1500.0,1100.5)

    salarios2.sort()
    salarios2.forEach { println(it) }

    println("-----")
}