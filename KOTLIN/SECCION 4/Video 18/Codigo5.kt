//código figura 18
package curso

fun main() {
    val empleados = arrayOf("Jesús", "Alberto", "Claudia")

    for (i in 0 until empleados.size) {
        println(empleados[i])

        if (empleados[i] == "Alberto") {
            break
        }
    }
}
//código de la figura 19
package curso

fun main() {
    for (x in 0..10 step 2){
        println(x)
    }
}




