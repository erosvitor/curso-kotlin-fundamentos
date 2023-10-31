import java.util.Scanner

fun main() {

  println("Login")
  println("")

  val leitura = Scanner(System.`in`)

  var login:String
  var loginValido:Boolean
  do {
    print("Digite o login: ")
    login = leitura.nextLine()

    if (login.isBlank()) {
      println("Login inválido, tente novamente.")
      loginValido = false
    } else {
      println("Login válido.")
      loginValido = true
    }
  } while (!loginValido)

}
