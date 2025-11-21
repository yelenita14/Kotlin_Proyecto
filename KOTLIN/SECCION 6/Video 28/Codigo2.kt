package curso

import clases.Nota
import java.util.*

fun main(){

    println(Nota.numeroInstancias)

    val nota1= Nota ("Ejemplo", "Ejemplo", Date())
    Nota ("Ejemplo", "Ejemplo", Date())
    Nota ("Ejemplo", "Ejemplo", Date())
    Nota ("Ejemplo", "Ejemplo", Date())
    Nota ("Ejemplo", "Ejemplo", Date())

    println(Nota.numeroInstancias)
}
