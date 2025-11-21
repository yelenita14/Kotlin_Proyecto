package curso

import clases.Nota
import java.util.*

fun main() {

    val nota1 = Nota(
        "Informacion de kotlin",
        "kotlin es un lenguaje de programacion de tipado estatico que corre sobre la maquina virtual de Java y que tambien puede ser compilado a codigo fuente de JavaScript. Es desarrollado principalmente por JetBrains en sus oficinas de San Petersburgo (Rusia). El nombre proviene de la isla de kotlin, situada cerca de San Petersburgo.",
        Date())

    println(nota1.contarPalabrasContenido("kotlin"))
}

