package clases

import java.util.*

class Nota (var nombre: String, var contenido: String, var fechacreacion: Date) {

    fun imprimirTotalCaracteresContenido(){
        println(contenido.length)
    }
}
