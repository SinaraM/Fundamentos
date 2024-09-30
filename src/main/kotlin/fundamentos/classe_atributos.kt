package fundamentos

class Carro(var cor: String, val anoFabricacao: Int, val dono: Dono) {

}
data class Dono(var nome: String, var idade: Int) {

}
fun main() {
    var carro = Carro("Branco", 2021, Dono("Sinara", 32))

    println(carro.cor)
    //mudar cor
    carro.cor = "Preto"

    println(carro.cor)

    println(carro.dono.nome)
    //mudar dono
    carro.dono.nome = "João Lucas"
    //mudar idade
    carro.dono.idade = 5

    println(carro.dono)
}