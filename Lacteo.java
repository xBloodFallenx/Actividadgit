public class Lacteo extends Producto {
    private boolean requiereFrio;

    public Lacteo(String nombre, double precio, boolean requiereFrio) {
        super(nombre, precio);
        this.requiereFrio = requiereFrio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Lácteo: " + nombre + " | Precio: $" + precio + " | Requiere Frío: " + (requiereFrio ? "Sí" : "No"));
    }
}