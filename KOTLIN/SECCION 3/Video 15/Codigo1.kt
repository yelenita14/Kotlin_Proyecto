import java.text.DecimalFormat

var tasaCambio = 0.0
var pesoEnCaja = 0.0
var dolaresEncaja = 0.0

fun main() {

    println("Ingresa la tasa de cambio de dólar a pesos: $")
    tasaCambio = readLine()!!.toDouble()

    println("Ingresa la cantidad de pesos para la apertura de caja: $")
    pesoEnCaja = readLine()!!.toDouble()

    println("Ingresa la cantidad de dólares para la apertura de caja: $")
    dolaresEncaja = readLine()!!.toDouble()

    println("Ingresa l cantidad de dólares a cambiar: $")
    val dolaresACambiar = readLine()!!.toDouble()

    dolaresEncaja += dolaresACambiar

    val pesosAEntregar = tasaCambio * dolaresACambiar

    pesoEnCaja -= pesosAEntregar

    val formato = "#,###.00"

    println("""
     	
     	** recibo **
      	Pesos mexicanos a entregar: $${DecimalFormat(formato).format(pesosAEntregar)}
     	
     	Pesos en caja:   $${DecimalFormat(formato).format(pesoEnCaja)}
     	Dólares en caja: $${DecimalFormat(formato).format(dolaresEncaja)}
 	""".trimIndent())

}
