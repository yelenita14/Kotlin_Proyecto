//código figura 9
package curso

fun main() {
    val edad = readln().toInt()
    when (edad){
        in 1..17 -> println("Es menor de edad")
        in 18..19 -> println("Es mayor de edad")
        in 60..100-> println("Es de la tercera edad")
        else -> println("Edad incorrecta")
    }
    main()
}
