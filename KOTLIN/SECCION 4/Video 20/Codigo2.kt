//Código figura 23
package curso

fun main() {
    println("Ingresa los nombres uno por uno, para finalizar e imprimir presiona enter\n")
    val listaEmpleados = arrayListOf<String>()
    do{
        print("Nombre:")
        val nombre = readLine().toString()
        if (nombre !="")listaEmpleados.add(nombre)
    }while(nombre !="")
    println("\n----Resultado---\n")
    println("Total: ${listaEmpleados.size}")
    for(empleado in listaEmpleados)println(empleado)
}

