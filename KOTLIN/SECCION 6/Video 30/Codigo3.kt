Código principal #1
package curso

import clases.Rectangulo

fun main(){

    val rectangulo = Rectangulo(10.0, 5.0)

    rectangulo.dibujar()

}

Código polígono #2

package clases

abstract class Poligono {
    abstract fun obtenerArea() : Double
    abstract fun obtenerPerimetro(): Double
    abstract fun dibujar()

    protected fun centimetrosAPulgadas(valor: Double): Double {
        return (1 / 2.54) * valor
    }
}
