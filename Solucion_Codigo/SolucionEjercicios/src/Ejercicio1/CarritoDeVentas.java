
package Ejercicio1;

public class CarritoDeVentas {
    private Producto p;
    private String [] listaProductos;

    public CarritoDeVentas() {
        this.p = null;
        this.listaProductos = new String[] {"MOUSEPAD", "MOUSE", "TECLADO", "COMPUTADORA"};
    }

    public void agregarProducto(String nombre, int cant){
        for (int i = 0; i < listaProductos.length; i++) {
            if (nombre.toUpperCase().equals(listaProductos[i])) {
                p = new Producto(nombre, ((i + 20) * (i + 1)));
                break;
            }
        }
        if (p == null) {
            System.out.println("PRODUCTO NO EXISTE");
            return;
        }
        if (cant <= p.getCantidad()) {
            System.out.println("PRODUCTO AGREGADO : ");
        } else {
            System.out.println("NO HAY SUFICIENTE CANTIDAD DEL PRODUCTO");
            p = null;
        }
    }
    
    public double CalcularTotal(int cantidad){
        return (double)cantidad * p.getPrecio();
    }
    
    public void RealizarPago(double pagoCliente){
        if (pagoCliente >= p.getPrecio()) {
            if (pagoCliente >= 1000) {
                System.out.println("PAGO REALIZADO CON DESCUENTO del 10%");
                p.setCantidad(p.getCantidad() - 1);
                System.out.println("CANTIDAD DE PRODUCTOS ACTUALIZADO " + p.getCantidad());
            } else {
                System.out.println("PAGO REALIZADO");
                p.setCantidad(p.getCantidad() - 1);
                System.out.println("CANTIDAD DE PRODUCTOS ACTUALIZADO " + p.getCantidad());
            }
        } else {
            System.out.println("NO PUEDE PAGAR, Cantidad faltante: " + (p.getPrecio() - pagoCliente));
        }
    }
    
    public void mostrarDetalleCompra(String producto, int cant){
        for (int i = 0; i < listaProductos.length; i++) {
            if (producto.toUpperCase().equals(listaProductos[i])) {
                System.out.println("Producto seleccionado: " + listaProductos[i] + " cantidad: " + cant);
            }
        }
    }

    public Producto getP() {
        return p;
    }

    public void setP(Producto p) {
        this.p = p;
    }
    
    
}
