class CuentaAhorro(
    numeroCuenta: Int,
    cliente: Cliente,
    saldoInicial: Double,
    val tasaInteres: Double
) : CuentaBancaria(numeroCuenta, cliente, saldoInicial) {

    override fun mostrarTipoCuenta() {
        println("Cuenta de Ahorro")
    }

    fun aplicarInteres() {
        val interes = obtenerSaldo() * tasaInteres
        depositar(interes)
        println("Interes aplicado de $: $interes")
    }
}
