package curso
fun main() {
    println("ingresa el valor del lado: ")
    val lado = readLine()!!.toDouble()

    val resultado = lado * lado
    println("el area es:")
    println(resultado)
}

Codigo#2


package curso
import kotlin.math.round
fun main() {

    val pi = 3.14159

    println(round(pi))
}
