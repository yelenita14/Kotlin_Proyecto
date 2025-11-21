código principal #1
package curso

import clases.Rectangulo

fun main(){

    val rectangulo = Rectangulo(10.0, 5.0)

    println(rectangulo.obtenerArea())

}

código polígono #2
package clases

abstract class Poligono {
    abstract fun obtenerArea() : Double
    abstract fun obtenerPerimetro(): Double

    protected fun centimetrosAPulgadas(valor: Double): Double {
        return (1 / 2.54) * valor
    }
}

