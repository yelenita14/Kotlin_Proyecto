package curso

import clases.Nota

fun main(){
    val nota1 = Nota()
    nota1.nombre = "Prueba 1"
    nota1.contenido = "Contenido de prueba"

    val nota2 = Nota()
    nota2.nombre = "Prueba 2"
    nota2.contenido = "Contenido de prueba"

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
}
