import java.util.Scanner

fun main() {

  println("Calcular preço consumidor")
  println("")

  val leitura = Scanner(System.`in`)

  val porcentagemDistribuidor = 28/100
  val impostos = 45/100

  print("Informe o custo de fábrica: ")
  val custoFabrica = leitura.nextFloat()

  var precoConsumidor = custoFabrica + (custoFabrica * porcentagemDistribuidor)
  precoConsumidor += (precoConsumidor * impostos)
  println("O preço consumidor é de $precoConsumidor")

}
