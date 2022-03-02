/*class Pessoa (
   /* val nome: String,
    val idade: Int,*/
    val maiorIdade: Boolean
        get() = return true

    )*/

fun ObterPalavraDica(): Array<String> {
    val arrayOfStrings = arrayOf("Casa", "Dica")
    return arrayOfStrings
}

fun retornarQuantidadeDeLetras(palavra: String): Int{
    return palavra.length - 2
}


fun main(){
    /*val pessoa: Pessoa = Pessoa("Henrique",20)
    val pessoa2: Pessoa = Pessoa("Eduardo", 22)
    var str: String? = readLine()
    println(str)
    println("Pessoa: ${pessoa.nome}")
    println("Pessoa: ${pessoa2.nome}")
        */
    var pal = ObterPalavraDica()
    //val list_pal: Array<String> = pal[0].split()
    val sr = "ABC"
    val delim = ""

    val list = sr.split(delim)
    var vetor = mutableListOf<String>()
    for(word in list){
        if(word != "/0" && word != "") {
            vetor.add(word)
            println(word + "-")
        }
    }
    println(vetor.toString())
    println(list.size)
    println(pal[0].contains('a'))
    println(pal[0].length)

    var str: String? = readLine()

}

/*
*
* fun ObterPalavraDica(){} -  Done
* fun retornarQuantidadeDeLetras(){} - Done
* fun retornarQuantidadeDeLetrasDistintas(){} -
* fun VerificarLetraInPalavra(){}
* fun letrasDescobertas(){}
* fun retornarStatusDaPalavra(){}
* fun Gerenciar Quantidade de tentativas
*
*
* */