package curso

fun main(){
    val a = Avion()
    println(a.numeroPasajero)
}

open class Aeronave(protected var numeroPasajero: Int){

    init {
        //println(numeroPasajero)
    }
}

class Avion : Aeronave(50){

    init{
        println(numeroPasajero)
    }
}
