class Tarea(val nombre: String, var estado: String)

fun main() {
    val tarea = Tarea("Hacer deberes", "PENDIENTE")

    when (tarea.estado) {
        "PENDIENTE" -> println("La tarea '${tarea.nombre}' está PENDIENTE.")
        "EN_PROCESO" -> println("La tarea '${tarea.nombre}' está EN PROCESOoooooo.")
        "REALIZADA" -> println("La tarea '${tarea.nombre}' está REALIZADAaaaaaaaaaaa.")
        else -> println("Estado desconocido o mal escrito.")
    }
}
