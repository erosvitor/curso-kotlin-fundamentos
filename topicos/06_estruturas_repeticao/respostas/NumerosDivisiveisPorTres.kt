fun main() {

  println("Números divisíveis por 3 entre 0 e 100")
  println("")
    
  for (numero in 0..100) {
    if (numero % 3 == 0) {
      println(numero)
    }
  }

}

