
import java.util.Scanner

fun main() {

  println("Média Aritmética")
  println("")
    
  val leitura = Scanner(System.`in`)
    
  var qtde = 1
  var nota = 0.0
  var somaDasNotas = 0.0
  while (qtde <= 4) {
    print("Digite a nota $qtde: ")
    nota = leitura.nextFloat()
    somaDasNotas += nota
    qtde++
  }
    
  val media = somaDasNotas / 4
  println("A média aritmética é: $media")

}
