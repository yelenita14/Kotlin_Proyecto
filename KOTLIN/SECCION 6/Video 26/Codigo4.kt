package clases

import java.util.*

class Nota(var nombre: String, var contenido: String, var fechaCreacion: Date) {

    constructor(nombre: String, contenido: String) : this(nombre, contenido, Date()){
        println("Se instanció la clase con el constructor secundario")
    }
}
