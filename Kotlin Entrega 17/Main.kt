fun main() {

    val cliente = Cliente("Juan Perez", "12.345.678-9")

    println("========================")
    println("Cliente")
    println("========================")
    cliente.mostrarInformacion()

    val cuentaAhorro = CuentaAhorro(1001, cliente, 50000.0, 0.05)
    println("\n========================")
    println("Cuenta de Ahorro")
    println("========================")
    cuentaAhorro.mostrarResumen()
    cuentaAhorro.depositar(10000.0)
    cuentaAhorro.retirar(15000.0)
    cuentaAhorro.aplicarInteres()
    println("\nResumen final cuenta de ahorro:")
    cuentaAhorro.mostrarResumen()

    val cuentaCorriente = CuentaCorriente(2002, cliente, 30000.0)
    println("\n========================")
    println("Cuenta Corriente")
    println("========================")
    cuentaCorriente.mostrarResumen()
    cuentaCorriente.depositar(5000.0)

    try {
        cuentaCorriente.retirar(100000.0)
    } catch (e: SaldoInsuficienteExcepcion) {
        println("Error: ${e.message}")
    }

    try {
        cuentaAhorro.depositar(0.0)
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }

    println("\nResumen final cuenta corriente:")
    cuentaCorriente.mostrarResumen()
}
