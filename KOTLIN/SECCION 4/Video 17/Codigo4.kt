//código figura 10
package curso

fun main() {
    val valor: Any = "Hola"

    when(valor){
        is String -> println("Es string")
        is Int -> println("Es int")
        is Long -> println("Es long")}
}
//codigo figura 10.1
package curso

fun main() {
    val valor: Any = 1

    when(valor){
        is String -> println("Es string")
        is Int -> println("Es int")
        is Long -> println("Es long")}
}
//código figura 10.2
package curso

fun main() {
    val valor: Any = 1L

    when(valor){
        is String -> println("Es string")
        is Int -> println("Es int")
        is Long -> println("Es long")}
}


