public class Embutido extends Producto {
    private String tipoCarne;

    public Embutido(String nombre, double precio, String tipoCarne) {
        super(nombre, precio);
        this.tipoCarne = tipoCarne;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Embutido: " + nombre + " (" + tipoCarne + ") | Precio: $" + precio);
    }
}