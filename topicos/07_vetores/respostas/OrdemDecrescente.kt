fun main() {

  println("Ordem decrescente")
  println("")

  val numeros = arrayOf(1, 2, 3, 4, 5, 6)

  for (i in numeros.size-1 downTo 0) {
    println(numeros[i])
  }

}
