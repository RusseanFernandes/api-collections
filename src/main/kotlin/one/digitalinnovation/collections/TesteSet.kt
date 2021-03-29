package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João",3500.0,"CLT")
    val maria = Funcionario("Maria",2500.0,"PJ")
    val jose = Funcionario("José",1980.0,"CLT")

    val funcionarios1 = setOf(joao,maria)
    val funcionarios2 = setOf(jose)

    val resultUnion = funcionarios1.union(funcionarios2) // União

    resultUnion.forEach { println(it) }

    println("------------------------") // Subtração
    val funcionarios3 = setOf(joao,jose,maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("------------------------") // Intercessão
    val resultInterset = funcionarios3.intersect(funcionarios2)
    resultInterset.forEach { println(it) }
}
