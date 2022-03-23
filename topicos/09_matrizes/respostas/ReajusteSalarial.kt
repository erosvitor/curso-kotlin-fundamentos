fun main() {

  println("Reajuste Salarial")
  println("")

  val dadosFuncionarios = arrayOf(
    doubleArrayOf(1001.0, 1.0, 5400.00),
    doubleArrayOf(1002.0, 1.0, 5500.00),
    doubleArrayOf(1003.0, 2.0, 4250.00),
    doubleArrayOf(1004.0, 2.0, 4400.00),
    doubleArrayOf(1005.0, 2.0, 4180.00),
    doubleArrayOf(1006.0, 3.0, 2700.00)
  )

  for (i in dadosFuncionarios.indices) {
    if (dadosFuncionarios[i][1] == 1.0) {
      dadosFuncionarios[i][2] += dadosFuncionarios[i][2] * 0.10
    } else if (dadosFuncionarios[i][1] == 2.0) {
      dadosFuncionarios[i][2] += dadosFuncionarios[i][2] * 0.08
    } else if (dadosFuncionarios[i][1] == 3.0) {
      dadosFuncionarios[i][2] += dadosFuncionarios[i][2] * 0.06
    }
  }

  for (i in dadosFuncionarios.indices) {
    println("Código funcionário: %.0f, salário reajustado: %.2f".format(dadosFuncionarios[i][0], dadosFuncionarios[i][2]))
  }

}
