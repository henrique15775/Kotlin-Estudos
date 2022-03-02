/*class Pessoa (
   /* val nome: String,
    val idade: Int,*/
    val maiorIdade: Boolean
        get() = return true

    )*/

class PalavraDica(
    val palavra: String,
    val dica: String
)

fun ObterPalavraDica(): Array<String> {
    val arrayOfStrings = arrayOf("Casa", "Dica")
    return arrayOfStrings
}

fun retornarQuantidadeDeLetras(palavra: String): Int{
    return palavra.length - 2
}

fun retornarQuantidadeDeLetrasDistintas(vetor: List<String>): Int{
    val new_vet = mutableListOf<String>()
    for(word in vetor){
        if(word != "/0" && word != "") {
        new_vet.add(word)

    }}
    return new_vet.distinct().size
}


fun VerificarLetraInPalavra(letra: Char, palavra: String): Boolean{
        return palavra.contains(letra)
}

fun letrasDescobertas(palavra: List<String>, letras_reveladas: List<String>): String{
    /*var word_found = mutableListOf<String>()
    for(word in palavra){
        for(word_revealed in letras_reveladas){
               if(word == word_revealed && !word_found.contains(word_revealed) && word != "/0" && word != "") {
                       word_found.add(word)
                       break
               }
        }
    }*/

    var str_words = palavra.joinToString().replace(",","").replace("/0","").replace(" ","")
    for(word in str_words){
        var confirm = false
        for(word_revealed in letras_reveladas){
           if(word.toString() == word_revealed){
               println("ENTROU AQ")
               confirm = true
               break
           }
       }
        if(confirm == false){
         str_words = str_words.replace(word,'*')
        }
    }
    return str_words
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
    var lista_descoberto = listOf<String>("a")
    var palavrinha = listOf<String>("c","a","s","a")
    //val list_pal: Array<String> = pal[0].split(
    val delim = ""
    println(lista_descoberto.toString())
    println(palavrinha.toString())
    println(letrasDescobertas( palavrinha,lista_descoberto))
    val list = pal[0].split(delim)
    /*var alt_list =list.joinToString().replace(",","").replace("/0","").replace(" ","")
    for(word in alt_list) {
        println(word)
    }*/

    //pal[0] = pal[0].replace('a','o')
    //println(pal[0])
    //var vetor = mutableListOf<String>()
    println("Quantidade de letras distintas -> ${retornarQuantidadeDeLetrasDistintas(list)}")
    /*for(word in list){
        if(word != "/0" && word != "") {
            vetor.add(word)
            println(word + "-")
        }
    }*/
    //println(vetor.toString())
    println(list.size)
    println(pal[0].contains('a'))
    println(pal[0].length)

    var str: String? = readLine()

}

/*
*
* fun ObterPalavraDica(){} -  Done
* fun retornarQuantidadeDeLetras(){} - Done
* fun retornarQuantidadeDeLetrasDistintas(){} - Done
* fun VerificarLetraInPalavra(){} - Done
* fun letrasDescobertas(){} -
* fun retornarStatusDaPalavra(){}
* fun Gerenciar Quantidade de tentativas
*
*
* */