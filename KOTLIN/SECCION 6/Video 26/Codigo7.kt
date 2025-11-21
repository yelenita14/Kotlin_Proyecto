package curso

import clases.Auto
import clases.Nota
import java.util.*

fun main(){
    val auto = Auto("Kia")
    println(auto.marca)
}

package clases

class Auto(var marca: String) {
}
