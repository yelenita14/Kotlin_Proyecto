// código de figura 16
package curso

fun main() {
    val valores = intArrayOf(10,15,25,45,80,60,10)
    var sumatoria = 0

    for ( i in 0 until valores.size){
        sumatoria += valores[i]
    }
    println(sumatoria)
}
//código de figura 17
package curso

fun main() {
    val empleados = arrayOf("Jesús","Alberto","Claudia")

    for (i in 0 until empleados.size){
        println(empleados[i])
    }
}
