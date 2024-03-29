import java.util.Scanner

val leitura = Scanner(System.`in`)

fun calcularAreaQuadrado() {
    println("")
    try {
        println("Digite o lado do quadrado: ")
        val lado = leitura.nextInt()
        val area = lado * lado
        println("A área do quadrado é $area")
        println("")
    } catch (e: Exception) {
        println("")
        println("O lado informado está incorreto")
        println("")
    }
}

fun calcularAreaTriangulo() {
    println("")
    try {
        println("Digite a base do triângulo: ")
        val base = leitura.nextInt()
        println("Digite a altura do triângulo: ")
        val altura = leitura.nextInt()
        val area = (base * altura) / 2
        println("A área do triângulo é $area")
        println("")
    } catch (e: Exception) {
        println("")
        println("A base ou a altura está incorreta")
        println("")
    }
}

fun main() {
    while (true) {
        println("1 - Calcular área quadrado")
        println("2 - Calcular área triângulo")
        println("3 - Finalizar")

        println("Digite a opção: ")
        val opcao = leitura.nextLine()
        if (opcao == "1") {
            calcularAreaQuadrado()
        } else if (opcao == "2") {
            calcularAreaTriangulo()
        } else if (opcao == "3") {
            break
        } else {
            println("Opção inválida! Tente novamente")
            println("")
        }
    }
}
