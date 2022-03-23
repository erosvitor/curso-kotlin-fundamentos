import java.util.Scanner

fun main() {

  println("Menu lanchonete")
  println("")

  val leitura = Scanner(System.`in`)

  println("1 – X-Salada")
  println("2 – X-Bacon")
  println("3 – X-Egg")
  println("4 – Refrigerante")
  println("5 – Finalizar pedido")

  print("Escolha um item do menu: ")
  val item = leitura.nextInt()

  when (item) {
    1 -> println("Você escolheu X-Salada")
    2 -> println("Você escolheu X-Bacon")
    3 -> println("Você escolheu X-Egg")
    4 -> println("Você escolheu Refrigerante")
    5 -> println("Você escolheu finalizar pedido")
    else -> println("Item inexistente")
  }

}

