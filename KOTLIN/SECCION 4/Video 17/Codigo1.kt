//código figura 7
package curso

fun main() {

    val valor = readLine()!!.toInt()

    when (valor) {
        1 -> {
            println("valor es 1")
        }
        2 -> println("valor es 2")
        else -> println("no es ni 1 ni 2")
    }

    main()
}
