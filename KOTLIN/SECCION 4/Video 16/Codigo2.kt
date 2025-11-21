//código figura 3
package curso

fun main() {
    println("Ingrese tu edad:")
    val edad = readLine()!!.toInt()

    if (edad < 18) {
        println("Es menor de edad")
    } else if (edad < 60) {
        println("Es mayor de edad")
    } else {
        println("Es de la tercera edad")
    }
    main()
}
