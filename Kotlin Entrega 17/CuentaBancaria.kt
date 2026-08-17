open class CuentaBancaria(
    val numeroCuenta    : Int,
    val cliente: Cliente,
    saldoInicial: Double
){
    private var saldo: Double = saldoInicial

    fun obtenerSaldo(): Double{
        return saldo
    }

    fun depositar(monto: Double){
        if(monto <= 0) {
            throw IllegalArgumentException("El deposito debe ser mayor a 0")
        }
        println("Saldo actual  $: $saldo")
        saldo += monto
        println("Deposito realizado de $: $monto")
        println("Saldo actualizado $: $saldo")
    }

    fun retirar(monto: Double) {
        if(monto <= 0){
            throw IllegalArgumentException("El retiro debe ser mayor a 0")
        }
        if(monto > saldo){
            throw SaldoInsuficienteExcepcion("Asegurate de tener el dinero suficiente para retirar")
        }
        println("Saldo actual  $: $saldo")
        saldo -=monto
        println("Monto el cual se retira  $: $monto")
        println("Saldo actual despues de retirar dinero $: $saldo")
    }

    open fun mostrarTipoCuenta(){
        println("Cuenta Bancaria")
    }
    open fun mostrarResumen(){
        println("--------------------------")
        println("Numero de cuenta: $numeroCuenta")
        println("Cliente: ${cliente.nombre}")
        println("Tipo de cuenta: ")
        mostrarTipoCuenta()
        println("Saldo: $saldo")
    }
}