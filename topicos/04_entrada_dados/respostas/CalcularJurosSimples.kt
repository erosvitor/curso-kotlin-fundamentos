import java.util.Scanner

fun main() {

   println("Calcular Juros Simples")
   println("")

   val leitura = Scanner(System.`in`)

   print("Digite o capital: ")
   val capital = leitura.nextFloat()

   print("Digite a taxa de juros (mensal): ")
   val taxa = leitura.nextFloat()

   print("Digite o período (em meses): ")
   val periodo = leitura.nextInt()

   val juros = capital * (taxa/100) * periodo
   println("O juros calculado foi de $juros")

}
