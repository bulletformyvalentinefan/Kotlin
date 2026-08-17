class CuentaCorriente(
    numeroCuenta: Int,
    cliente: Cliente,
    saldoInicial: Double
) : CuentaBancaria(numeroCuenta, cliente, saldoInicial) {

    override fun mostrarTipoCuenta() {
        println("Cuenta Corriente")
    }
}
