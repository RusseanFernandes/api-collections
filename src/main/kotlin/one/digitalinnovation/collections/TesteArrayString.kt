package one.digitalinnovation.collections

fun main() {
    val nome = Array(3) {""}
    nome[0] = "José"
    nome[1] = "Maria"
    nome[2] = "João"

    nome.forEach { println(it) }

    println("-----")

    for (nomes in nome){
        println(nomes)
    }

    println("-----")

    val nome2 = arrayOf("José","Maria","João")

    nome2.sort()
    nome2.forEach { println(it) }

    println("-----")
}