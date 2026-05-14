
package Ejercicio1;

import java.util.Scanner;

public class SistemaVentas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("=====BIENVENIDO AL SISTEMA DE VENTAS=====");
        System.out.println("Ingrese nombre del producto: "); String nombre = tcl.next();
        System.out.println("Ingrese cantidad a comprar: "); int cant = tcl.nextInt();
        
        CarritoDeVentas carrito = new CarritoDeVentas();
        carrito.agregarProducto(nombre, cant);
        
        if (carrito.getP() != null) {
            System.out.println("TOTAL A PAGAR: " + carrito.CalcularTotal(cant));
            System.out.println("INGRESE MONTO A PAGAR: "); double pago = tcl.nextDouble();
            carrito.RealizarPago(pago);
            carrito.mostrarDetalleCompra(nombre, cant);
            
        } else {
            System.out.println("NO EXISTE EL PRODUCTO");
        }

    }
}
