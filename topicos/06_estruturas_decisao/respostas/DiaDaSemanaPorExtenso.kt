import java.util.Scanner

fun main() {

  println("Dia da semana por extenso")
  println("")

  val leitura = Scanner(System.`in`)

  print("Digite o dia da semana (1-7): ")
  val diaSemana = leitura.nextInt()

  when (diaSemana) {
    1 -> println("Domingo")
    2 -> println("Segunda-feira")
    3 -> println("Terça-feira")
    4 -> println("Quarta-feira")
    5 -> println("Quinta-feira")
    6 -> println("Sexta-feira")
    7 -> println("Sábado")
    else -> println("Dia da semana inválido")
  }

}
