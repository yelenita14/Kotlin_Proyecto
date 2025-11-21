package clases

import java.util.*

class Nota (var nombre: String, var contenido: String, var fechacreacion: Date) {

    fun contarPalabrasContenido(): Int {

        val palabras = contenido.split("")

        return palabras.size
    }

    fun contarPalabrasContenido(palabra: String): Int {

        val palabras = contenido.split("")

        var contador = 0

        palabras.forEach {
            if (it == palabra) contador++
        }

        return contador
    }

}

