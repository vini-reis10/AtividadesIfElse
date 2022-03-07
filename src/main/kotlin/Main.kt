fun main() {

    atividade1()
    atividade2()
    atividade3()
    atividade4()
}

fun atividade1(): Unit {
    println("Digite o valor dO lado A:")
    val ladoA = readLine()!!.toFloat()
    println("Digite o valor do lado B:")
    val ladoB = readLine()!!.toFloat()
    println("Digite o valor do lado C:")
    val ladoC = readLine()!!.toFloat()
    triangulo(ladoA, ladoB, ladoC)
}

fun triangulo(ladoA: Float, ladoB: Float, ladoC: Float) {
    if (ladoA == ladoB && ladoA == ladoC)
        println("E um triangulo equilatero!")
    else if (ladoA != ladoB && ladoA != ladoC)
        println("e um triangulo Escaleno")
    else
        println("triangulo isosceles")


}

fun atividade2(): Unit {
    println("Digite o ano que voce deseja saber:")
    val ano = readLine()!!.toInt()
    if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0)
        println("$ano e bissexto")
    else
        println("$ano NAO e bissexto")

}

fun atividade3(): Unit {
    var contador = 0
    println("Responda as perguntas com 1 para SIM ou 0 para NAO")

    //Fazendo as perguntas e guardando
    println("Telefonou para vitima?")
    val pergunta1 = readLine()!!.toInt()
    println("Esteve no local do crime?")
    val pergunta2 = readLine()!!.toInt()
    println("Mora perto da vitima?")
    val pergunta3 = readLine()!!.toInt()
    println("Devia para a vítima?")
    val pergunta4 = readLine()!!.toInt()
    println("Já trabalhou com a vítima?")
    val pergunta5 = readLine()!!.toInt()

    //Verifica as resposta "sim"
    if (pergunta1 == 1)
        contador++
    if (pergunta2 == 1)
        contador++
    if (pergunta3 == 1)
        contador++
    if (pergunta4 == 1)
        contador++
    if (pergunta5 == 1)
        contador++

    //calculando os resultados
    if (contador == 5)
        println("Você é assassino!")
    else if (contador >= 3)
        println("Você é cumplice!")
    else
        println("Você é suspeito!")


}

fun atividade4(): Unit {

    println("Digite a quantidade de combustivel que você deseja abastecer:")
    val quantidadeCombustivel = readLine()!!.toFloat()
    println("Digite o tipo de combustivel: \nA - Alcool e \nG - Gasolina")
    val combustivel = readLine()

    val valorDoAlcool = 6.70f
    val valorDaGasolina = 6.82f


    if(quantidadeCombustivel <= 20f && combustivel == "a")
        println("O valor total da compra é ${quantidadeCombustivel * valorDoAlcool - (valorDoAlcool * 0.03)}")
    else if(quantidadeCombustivel >= 20f && combustivel == "a")
        println("O valor total da compra é ${quantidadeCombustivel * valorDoAlcool - (valorDoAlcool * 0.05)}")
    else if (quantidadeCombustivel <= 20f && combustivel == "g")
        println("O valor total da compra é ${quantidadeCombustivel * valorDaGasolina - (valorDaGasolina * 0.04)} ")
    else if (quantidadeCombustivel >= 20f && combustivel == "g")
        println("O valor total da compra é ${quantidadeCombustivel * valorDaGasolina - (valorDaGasolina * 0.06)}")


}


