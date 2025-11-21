//código de figura 21
package curso

fun main() {
    val empleados = arrayListOf("Jesús","Alberto","Claudia")

    empleados.forEachIndexed { i, empleado ->
        println("$i - $empleado")
        println("---------")
    }
}

