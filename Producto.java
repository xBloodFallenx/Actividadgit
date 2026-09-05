public class Producto {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
    }
}