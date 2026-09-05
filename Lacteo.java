public class Lacteo extends Producto {
    private boolean requiereRefrigeracion;

    public Lacteo(String nombre, double precio, boolean requiereRefrigeracion) {
        super(nombre, precio);
        this.requiereRefrigeracion = requiereRefrigeracion;
    }

    @Override
    public void mostrarDetalles() {
        String refri = requiereRefrigeracion ? "Sí" : "No";
        System.out.println("Lácteo: " + nombre + " | Requiere frío: " + refri + " | Precio: $" + precio);
    }
}