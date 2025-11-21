package curso

import clases.Nota
import java.util.*

fun main(){

    val nota1 = Nota("Nota 1", "Contenido 1")

    val nota2 = Nota("Nota 2", "Contenido 2", Date())

    println(nota1.nombre)
    println(nota2.nombre)
}

package clases

import java.util.*

class Nota(var nombre: String, var contenido: String, var fechaCreacion: Date) {

    init {
        nombre = nombre.uppercase()
    }

    constructor(nombre: String, contenido: String) : this(nombre, contenido, Date()){
        println("Se instanció la clase con el constructor secundario")
    }
}
