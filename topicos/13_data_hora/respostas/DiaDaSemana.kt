import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Scanner

fun main() {

  println("Dia da semana que o usuário nasceu")
  println()

  val leitura = Scanner(System.`in`)

  print("Digite a sua data de nascimento: ")
  val dataNascimentStr = leitura.nextLine()

  val dataNascimento = LocalDate.parse(dataNascimentStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"))
  val diaSemana = dataNascimento.dayOfWeek.value

  val nomeDiaSemana:String
  when (diaSemana) {
    1 -> nomeDiaSemana = "Segunda-feira"
    2 -> nomeDiaSemana = "Terça-feira"
    3 -> nomeDiaSemana = "Quarta-feira"
    4 -> nomeDiaSemana = "Quinta-feira"
    5 -> nomeDiaSemana = "Sexta-feira"
    6 -> nomeDiaSemana = "Sábado"
    7 -> nomeDiaSemana = "Domingo"
    else -> nomeDiaSemana = "Inválido"
  }

  if (diaSemana <= 5) {
    println("Você nasceu numa $nomeDiaSemana")
  } else {
    println("Você nasceu num $nomeDiaSemana")
  }

}
