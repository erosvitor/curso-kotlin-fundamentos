import java.util.Scanner

fun main() {

  println("Calcular área de um triângulo")
  println("")

  val leitura = Scanner(System.`in`)

  print("Digite a base do triângulo: ")
  val base = leitura.nextInt()

  print("Digite a altura do triângulo: ")
  val altura = leitura.nextInt()

  val area = (base * altura) / 2
  println("A área do triângulo é: $area")

}
