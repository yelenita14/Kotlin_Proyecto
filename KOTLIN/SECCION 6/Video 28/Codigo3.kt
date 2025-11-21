package clases

import java.util.*

class Nota (var texto: String, var contenido: String, var fechaCreacion: Date) {

    init {
        numeroInstancias++

        if (texto.length > LONGITUD_MAXIMA_NOMBRE) throw Exception("El nombre no puede tener mas de 10 caracteres")
    }

    companion object {

        const val LONGITUD_MAXIMA_NOMBRE = 10

        var numeroInstancias = 0

        fun mostrarNumeroInstancias() {
            println(numeroInstancias)
        }
    }
}
