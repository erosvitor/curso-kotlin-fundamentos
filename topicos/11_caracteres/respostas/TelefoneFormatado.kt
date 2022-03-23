import java.util.Scanner

fun main() {

  println("Número Telefone Formatado")
  println()

  val leitura = Scanner(System.`in`)

  print("Digite um número de telefone: ")
  val telefone = leitura.nextLine()

  val telefoneSemFormatacao = StringBuilder()
  for (i in telefone.indices) {
    if (telefone[i].isDigit()) {
      telefoneSemFormatacao.append(telefone[i])
    }
  }

  val telefoneComFormatacao = StringBuilder()
  telefoneComFormatacao.append("(")
  telefoneComFormatacao.append(telefoneSemFormatacao.toString().substring(0,2))
  telefoneComFormatacao.append(")")

  telefoneComFormatacao.append(" ")

  telefoneComFormatacao.append(telefoneSemFormatacao.toString().subSequence(2, 7))
  telefoneComFormatacao.append("-")
  telefoneComFormatacao.append(telefoneSemFormatacao.toString().subSequence(7, 11))

  println(telefoneComFormatacao.toString())
  
}
