fun main() {

  println("Relatório Estatístico")
  println("")

  val dados = arrayOf(
    arrayOf(1450.40, 1),
    arrayOf(2630.00, 2),
    arrayOf(970.00, 2),
    arrayOf(1790.30, 1),
    arrayOf(2150.10, 3),
    arrayOf(1080.00, 2),
    arrayOf(1920.60, 2),
    arrayOf(2530.80, 3)
  )

  var totalSalarios = 0.0
  var totalNumeroFilhos = 0.0
  var maiorSalario = 0.0

  for (i in dados.indices) {
    totalSalarios += dados[i][0].toDouble()
    totalNumeroFilhos += dados[i][1].toInt()
    if (dados[i][0].toDouble() > maiorSalario) {
      maiorSalario = dados[i][0].toDouble()
    }
  }

  val salarioMedio = totalSalarios / dados.size
  println("O salário médio é de: $salarioMedio")

  val mediaQtdeFilhos = totalNumeroFilhos / dados.size
  println("A quantidade média de filhos é: $mediaQtdeFilhos")

  println("O maior salário é: $maiorSalario")

}
