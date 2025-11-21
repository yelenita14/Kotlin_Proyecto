package curso

import clases.Nota
import java.util.*

fun main(){

    val nota1 = Nota("Nota 1", "Contenido 1")

    val nota2 = Nota("Nota 2", "Contenido 2", Date())
}


package clases

import java.util.*

class Nota(var nombre: String, var contenido: String, var fechaCreacion: Date) {

    constructor(nombre: String, contenido: String) : this(nombre, contenido, Date())
}
