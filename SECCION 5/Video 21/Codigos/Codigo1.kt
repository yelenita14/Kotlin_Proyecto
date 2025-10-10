package curso

fun main(){

    try {
        val valor = readLine()!!.toDouble()
        println(valor)
    } catch (e: Exception){
        println("Entrada incorrecta, el valor debe ser un numero")
        main()
    }
}

