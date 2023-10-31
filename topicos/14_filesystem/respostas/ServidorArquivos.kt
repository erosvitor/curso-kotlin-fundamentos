import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths

fun main() {

    val diretorioBase = Paths.get("").toAbsolutePath().toString()
    val diretorioDocs = diretorioBase + "/docs"

    var pathDiretorioDocs = Paths.get(diretorioDocs)
    try {
        Files.createDirectory(pathDiretorioDocs)

        Files.createDirectories(Paths.get(diretorioDocs + "/gerencia/financeira"))
        Files.createDirectories(Paths.get(diretorioDocs + "/gerencia/administrativa"))

        Files.createDirectories(Paths.get(diretorioDocs + "/publico/fotos"))
        Files.createDirectories(Paths.get(diretorioDocs + "/publico/manuais"))
    } catch (e: IOException) {
        e.printStackTrace()
        return
    }

    var file = File(diretorioDocs + "/gerencia/responsaveis.txt")
    file.bufferedWriter().use { buffer ->
        buffer.write("Fulano da Silva\n")
        buffer.write("Beltrano Gomes\n")
        buffer.write("Siclano Cunha\n")
    }

    file = File(diretorioDocs + "/publico/descricao.txt")
    file.bufferedWriter().use { buffer ->
        buffer.write("Diretório 'fotos'\n")
        buffer.write("Destinado ao armazenamento de fotos de eventos, comemorações e feiras\n")
        buffer.write("\n")
        buffer.write("Diretório 'manuais'\n")
        buffer.write("Destinado ao armazenamento de manuais dos produtos comercializados pela empresa.\n")
    }

}
