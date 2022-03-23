import java.util.Scanner

fun main() {

  println("Mostra conteúdo de uma matriz")
  println("")

  val leitura = Scanner(System.`in`)

  var matriz = arrayOf(Array(2) {0}, Array(2) {0})

  for (i in 0..matriz.size-1) {
    for (j in 0.. matriz[i].size-1) {
      print("Digite o elemento para a posição %d,%d da matriz: ".format(i, j))
      matriz[i][j] = leitura.nextInt()
    }
  }

  for (i in 0..matriz.size-1) {
    for (j in 0.. matriz[i].size-1) {
      print(matriz[i][j])
    }
    println("")
  }

}
