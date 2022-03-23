import java.util.Scanner

fun main() {

  println("Valor Médio")
  println("")

  val leitura = Scanner(System.`in`)

  val valores = Array(5) { 0 }

  for (i in valores.indices) {
    println("Digite o valor " + (i+1))
    valores[i] = leitura.nextInt()
  }

  var totalValores = 0
  for (valor in valores) {
    totalValores += valor
  }

  val valorMedio = totalValores / valores.size
  println("O valor médio é $valorMedio")

}
