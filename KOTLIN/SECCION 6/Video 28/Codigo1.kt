package clases

import java.util.*

class Nota (var nombre: String, var contenido: String, var fechacreacion: Date) {

    init {
        numeroInstancias++
    }

    companion object {

        var numeroInstancias = 0

    }
}
