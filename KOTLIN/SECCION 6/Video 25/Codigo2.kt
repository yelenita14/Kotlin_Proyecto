fun main(){
    val nota1 = Nota()
    nota1.nombre = "Prueba 1"
    nota1.contenido = "Contenido de prueba"

    println(nota1.nombre)
    println(nota1.contenido)
    println(nota1.fechaCreacion)

    nota1.nombre = "Nota actualizada"

    println(nota1.nombre)
    println(nota1.contenido)
    println(nota1.fechaCreacion)
}
