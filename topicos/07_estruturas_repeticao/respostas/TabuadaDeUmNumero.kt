import java.util.Scanner

fun main() {

  println("Tabuada de um número")
  println("")

  val leitura = Scanner(System.`in`)

  print("Digite um número inteiro entre 1 e 10: ")
  val numero = leitura.nextInt()

  for (i in 1..10) {
    println("%d x %d = %d".format(numero, i, numero*i))
  }

}
