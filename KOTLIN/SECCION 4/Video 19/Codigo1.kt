//código de la figura 20
package curso

fun main() {
    val empleados = arrayListOf("Jesús", "Alberto", "Claudia")

    empleados.add("Alejandro")

    empleados.sort()
    for (empleado in empleados) println(empleado)
    println("----------")

    empleados.removeAt(3)

    for (empleado in empleados) println(empleado)
    println("----------")
}
