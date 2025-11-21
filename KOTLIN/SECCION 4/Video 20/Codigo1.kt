//código while figura 22
package curso

fun main() {
    println("Ingresa los nombres uno por uno, para finalizar e imprimir presiona enter\n")
    val listaEmpleados = arrayListOf<String>()
    print("Nombre: ")
    var nombre = readLine().toString()

    while(nombre !=""){
        listaEmpleados.add(nombre)
        print("Nombre:")
        nombre = readLine().toString()
    }
    println("\n----Resultado----\n")
    for (empeados in listaEmpleados) println(empeados)
}
