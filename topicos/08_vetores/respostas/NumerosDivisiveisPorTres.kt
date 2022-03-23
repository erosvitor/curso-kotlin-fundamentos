fun main() {

  println("Números divisíveis por três")
  println("")

  val numeros = arrayOf(8, 6, 27, 13, 36, 9)

  for (i in 0..numeros.size-1) {
    if (numeros[i] % 3 == 0) {
      println(numeros[i])
    }
  }

}
