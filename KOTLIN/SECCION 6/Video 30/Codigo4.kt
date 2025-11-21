Código rectangular #3
package clases

import kotlin.math.roundToInt

class Rectangulo(var base: Double, var altura: Double) : Poligono() {

    override fun obtenerArea(): Double {
        return base * altura
    }

    override fun obtenerPerimetro(): Double {
        return (2 * base) + (2 * altura)
    }

    fun obtenerAreaPulgadas(): Double {
        return centimetrosAPulgadas(obtenerArea())
    }

    fun obtenerPerimetroPulgadas(): Double {
        val perimetro = obtenerPerimetro()
        return centimetrosAPulgadas(perimetro)
    }

    override fun dibujar() {
        for (i in 1..altura.roundToInt()) {
            println(" * ".repeat(base.toInt()))
        }
    }
}
