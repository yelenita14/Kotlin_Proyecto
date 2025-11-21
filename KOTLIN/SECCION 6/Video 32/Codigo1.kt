enum class DiaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}

fun main() {
    val hoy = DiaSemana.MARTES

    when (hoy) {
        DiaSemana.LUNES -> println("Inicio de semana")
        DiaSemana.VIERNES -> println("Fin de semana cerca")
        DiaSemana.DOMINGO -> println("Día de descanso")
        else -> println("Un día normal")
    }
}
