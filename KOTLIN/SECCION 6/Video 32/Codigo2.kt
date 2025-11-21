enum class EstadoTarea {
    PENDIENTE,
    EN_PROCESO,
    REALIZADA
}

class Tarea(val nombre: String, var estado: EstadoTarea)

fun main() {
    val tarea = Tarea("Hacer deberes", EstadoTarea.PENDIENTE)

    when (tarea.estado) {
        EstadoTarea.PENDIENTE -> println("La tarea '${tarea.nombre}' está PENDIENTE.")
        EstadoTarea.EN_PROCESO -> println("La tarea '${tarea.nombre}' está EN PROCESO.")
        EstadoTarea.REALIZADA -> println("La tarea '${tarea.nombre}' está REALIZADA.")
    }
}
