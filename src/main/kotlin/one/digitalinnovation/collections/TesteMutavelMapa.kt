package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João",3500.0,"CLT")
    val maria = Funcionario("Maria",2500.0,"PJ")
    val jose = Funcionario("José",1980.0,"CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome,joao)
    repositorio.create(maria.nome,maria)
    repositorio.create(jose.nome,jose)

    println(repositorio.findById(joao.nome)) // Imprimindo o João
    println("-------------------------------")
    repositorio.findAll().forEach { println(it) } // Imprimir todos função findAll

    println("-------------------------------")
    repositorio.remove(maria.nome)              // Removendo a Maria do Repositório
    repositorio.findAll().forEach { println(it) }

}