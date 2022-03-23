import java.util.Scanner

fun main() {

  println("Verificar se um número é par ou ímpar")
  println("")

  val leitura = Scanner(System.`in`)

  print("Digite um número inteiro maior que zero: ")
  val numero = leitura.nextInt()

  if (numero % 2 == 0) {
    println("O número é PAR")
  } else {
    println("O número é ÍMPAR")
  }

}
