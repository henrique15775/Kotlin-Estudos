class Pessoa (
    val nome: String,
    val idade: Int

    )

fun main(){
    val pessoa: Pessoa = Pessoa("Henrique",20)
    val pessoa2: Pessoa = Pessoa("Eduardo", 22)

    println("Pessoa: ${pessoa.nome}")
    println("Pessoa: ${pessoa2.nome}")

}
