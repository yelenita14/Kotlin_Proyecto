package curso

import clases.Nota
import java.util.*

fun main(){
    val nota1 = Nota("Nota 1", "Contenido de la nota 1", Date())

    val nota2 = Nota("Nota 2", "Contenido de la nota 2", Date())

    val listaNotas = arrayListOf<Nota>()

    listaNotas.add(nota1)
    listaNotas.add(nota2)

    listaNotas.forEach{
        println("""
           ${it.nombre}
           ${it.contenido}
           ${it.fechaCreacion}
           ---------------------
           """.trimIndent())
    }

    listaNotas[0].nombre = "Nombre actualizado"

    listaNotas.forEach{
        println("""
           ${it.nombre}
           ${it.contenido}
           ${it.fechaCreacion}
           ---------------------
           """.trimIndent())
    }
}

package clases

import java.util.*

class Nota(val nombre: String, var contenido: String, var fechaCreacion: Date) {
}
