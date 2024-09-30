package fundamentos

fun main(){
    dizOi(retornaNome(), 32)
    dizOi(idade = 24, nome = "Sinara")
    dizOi("João Lucas") //como não defini a idade ele pega a da função chumbada abaixo = 5
}
fun retornaNome(): String{
    return "Sinara"
}
fun dizOi(nome: String, idade: Int = 5){
    println("Oi ${nome}, parabéns pelos seus ${idade} anos")
}