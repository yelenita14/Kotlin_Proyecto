package ejecutable

import clases.Auto

fun main(){
    val auto = Auto("Kia")
    println(auto.marca)
}

package clases

internal class Auto(var marca: String) {
}
