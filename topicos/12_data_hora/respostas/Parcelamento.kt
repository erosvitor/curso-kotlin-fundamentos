import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Scanner

fun main() {

  println("Parcelamento")
  println()

  val leitura = Scanner(System.`in`)

  var dataAtual = LocalDate.now()

  print("Digite o valor da compra: ")
  val valorCompra = leitura.nextFloat()

  println("Deseja parcelar em quantas vezes (2-5)?")
  val numeroParcelas = leitura.nextInt()

  val valorParcelado = valorCompra / numeroParcelas

  for (i in 0..<numeroParcelas) {
    dataAtual = dataAtual.plusDays(30)

    println("Parcela %d: %.2f".format(i+1, valorParcelado))
    println("Pagamento em: %s".format(dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))))
  }

}
