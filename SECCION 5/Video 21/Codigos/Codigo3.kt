package curso

import java.io.File
import java.io.FileNotFoundException
import java.lang.Exception

fun main(){

    try {

        val repeticiones = readLine()!!.toInt()

        val mensaje = File("C:\\Users\\jorge\\Documents\\TMP\\mensaje.txt").readLines()[0]

        for (i in 0 until repeticiones) println(mensaje)
    } catch (e: FileNotFoundException){
        println( "El archivo no existe")
    } catch (e: NumberFormatException){
        println("El valor de repeticiones debe ser un numero")
    } catch (e: Exception){
        println("Error: ${e.localizedMessage}")
    } finally {

        println("Entro al finally")
    }
}

