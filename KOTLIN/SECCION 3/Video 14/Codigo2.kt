package curso

fun main() {

    println(calcularImpuestus(20_000.00, 10.0 ))
    println(calcularImpuestus(10_000.00, 16.0 ))

}

fun calcularImpuestus(salario: Double, porcentajeImpuetos: Double): Double {

    val totalImpuestos = (salario / 100) * porcentajeImpuetos

    return totalImpuestos

}
