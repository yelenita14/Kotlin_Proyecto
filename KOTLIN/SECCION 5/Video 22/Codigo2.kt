package curso

fun main (){

        val entrada = readLine()

        val lado = entrada?.toDoubleOrNull() ?: 0.0

        val resultado = lado * lado

        println(resultado)
}


