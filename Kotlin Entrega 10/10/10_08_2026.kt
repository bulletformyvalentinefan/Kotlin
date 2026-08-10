fun main() {


   val producto: String = "Mouse"
   var cantidad: Int = 100
   val precio: Double = 250.000
   val disponible: Boolean = true
   val categoria: Char = 'A'

   println("========================")
   println("Productos")
   println("========================")
   println("Producto: $producto")
   println("Cantidad: $cantidad")
   println("Precio: $precio")
   println("Disponible: $disponible")
   println("Categorua: $categoria")
   println("Total: ${calcularPrecio(precio, cantidad)}")

}

fun calcularPrecio(precio: Double, cantidad: Int): Double = precio * cantidad.toDouble()

/*
 ========================
PRODUCTO
========================
Producto: Teclado
Precio: 29990.0
Cantidad: 2
Disponible: true
Categoría: T
Total: 59980.0
*/
