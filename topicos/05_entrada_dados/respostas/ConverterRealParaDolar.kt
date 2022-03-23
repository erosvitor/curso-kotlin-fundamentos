import java.util.Scanner

fun main() {

  println("Converter reais para dólares")
  println("")

  val leitura = Scanner(System.`in`)

  val cotacaoDolar = 3.35

  print("Digite um valor em reais: ")
  val reais = leitura.nextInt()

  val dolares = reais * cotacaoDolar
  println("%d reais equivalem a %.2f dolares".format(reais, dolares))

}
