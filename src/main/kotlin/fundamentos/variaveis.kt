package fundamentos

fun main(){
    var nome = "Sinara"  //mutável
    val nomeVal = "Sinara" //imutável

    nome = "Sinara"
   // nomeVal = "João Lucas" //reclama por ser imutável e eu mudei de Sinara para João Lucas

    val idade = 32
    println(idade)
}
//classes precisam ser iniciadas (ex.: qual a string?? = "Teste" = val teste: String = "Teste")
// Ou utilizamos o lateinit var que é pra ser informada depois

class variaveis{
    lateinit var teste: String

    fun iniciaVariaveis() {
        teste = "Teste"
    }
}