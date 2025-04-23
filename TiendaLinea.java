public class TiendaLinea {
    public static void main(String[] args) {

        //Detalle del producto 
        System.out.println("*** Tienda en Linea (Detalles de producto)***");
        String nombreProducto = "Laptop HP";

        double precioProducto = 1000.50;
        int cantidadDisponible = 15;
        boolean DisponibleVenta = true;

        // imprimir el detalle del producto 
        System.out.println("--NombreProducto--" + nombreProducto);
        System.out.println("--PrecioProducto--" + precioProducto);
        System.out.println("--CantidadDisponible--" + cantidadDisponible);
        System.out.println("--DisponibleVenta--" + DisponibleVenta);

        // Modificar los valores 

        nombreProducto = "Laptop HP x3600 Spectre";
        precioProducto = 900.50 ;
        cantidadDisponible = 0;
        DisponibleVenta = false ;

        System.out.println("NombreProducto--" + nombreProducto);
        System.out.println("PrecioProducto--" + precioProducto);
        System.out.println("CantidadDisponible--" + cantidadDisponible);
        System.out.println("DisponibleVenta--" + DisponibleVenta);



    }
}