//código Figura 8
package curso

fun main() {

    val combustible = "Gasolina"

    when (combustible) {
        "Gasolina", "Diésel" -> println("Utiliza gasolina o diésel")
        else -> println("Utiliza otro combustible")
    }
}

