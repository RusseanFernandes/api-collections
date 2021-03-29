package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João",3500.0,"CLT")
    val maria = Funcionario("Maria",2500.0,"PJ")
    val jose = Funcionario("José",1980.0,"CLT")

    val funcionarios = mutableListOf(joao,maria)
    println("------------LIST-------------")
    funcionarios.forEach { println(it) }
    println("----------------------------")
    funcionarios.add(jose)
    funcionarios.forEach { println(it) }
    println("----------------------------")
    funcionarios.remove(maria)
    funcionarios.forEach { println(it) }

    println("------------SET-------------")
    val funcionarioSet = mutableSetOf(maria)
    funcionarioSet.forEach { println(it) }
    println("----------------------------")
    funcionarioSet.add(joao)
    funcionarioSet.add(jose)
    funcionarioSet.forEach { println(it) }
    println("----------------------------")
    funcionarioSet.remove(joao)
    funcionarioSet.forEach { println(it) }
    println("----------------------------")
    funcionarioSet.remove(jose)
    funcionarioSet.forEach { println(it) }

}