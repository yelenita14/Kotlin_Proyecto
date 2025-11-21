package curso
fun main() {
    println("ingresa tu nombre: ")
    val nombre = readLine()
    println("ingresa tu edad: ")
    val edad = readLine()

    println("""
       *** Datos ***
       Nombre: $nombre
       Edad: $edad""".trimIndent())
}
