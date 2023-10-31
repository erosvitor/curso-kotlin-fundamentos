import java.io.File

fun main() {

  val customers = File("clientes.txt")
  val listaEmails = File("lista-emails.txt")

  val bufferInput: List<String> = customers.readLines()
  listaEmails.bufferedWriter().use { buffer ->
    bufferInput.forEach { line ->
      val data = line.split(",")
      var email = data[2]
      // Remove possíveis espaços em branco
      email = email.trim()
      //  Remove aspas simples
      email = email.replace("'", "")
      
      buffer.write(email + "\n")
    }
  }

}
