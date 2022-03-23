import java.io.File
import java.io.FileWriter

fun main() {

  val enderecosIP = File("enderecosip.txt")
  val enderecosClassA = FileWriter("enderecos-classe-a.txt", false)
  val enderecosClassB = FileWriter("enderecos-classe-b.txt", false)
  val enderecosClassC = FileWriter("enderecos-classe-c.txt", false)

  val enderecos:List<String> = enderecosIP.readLines()
  enderecos.forEach { endereco ->
    val posicaoCorte = endereco.indexOf('.')
    val primeiroOctetoStr = endereco.substring(0, posicaoCorte)
    val primeiroOcteto = primeiroOctetoStr.toInt()

    if (primeiroOcteto <= 126) {
      enderecosClassA.write(endereco + "\n")
    } else if (primeiroOcteto <= 191) {
      enderecosClassB.write(endereco + "\n")
    } else {
      enderecosClassC.write(endereco + "\n")
    }
  }
  enderecosClassA.close()
  enderecosClassB.close()
  enderecosClassC.close()

}
