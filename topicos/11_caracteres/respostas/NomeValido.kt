import java.util.Scanner

fun main() {

  println("Nome válido")
  println("")

  val leitura = Scanner(System.`in`)

  print("Digite o nome completo de uma pessoa: ")
  val nome = leitura.nextLine()

  var caractere:Char
  var nomeValido = true
  for (i in nome.indices) {
    caractere = nome[i]
    if (!caractere.isLetter() && !caractere.isWhitespace()) {
      nomeValido = false
      break
    }
  }

  if (nomeValido) {
    println("O nome informado é válido")
  } else {
    println("O nome informado é inválido")
  }
  
}
