Codigo #1
package curso
import java.util.Date
fun main() {
    mostrarMensaje()
}
fun mostrarMensaje(){
    println("""
       mensaje: Hola desde Kotlin
       fecha: ${Date()}
   """.trimIndent())
}

Codigo #2
package curso
fun main() {
    mostrarDatos(nombre = "Anny", edad = 20)
    mostrarDatos(nombre = "Mishelle", edad = 20)
}
fun mostrarDatos(nombre: String, edad: Int){
    println("""
        Nombre: $nombre
        Edad: $edad
    """.trimIndent())
}


