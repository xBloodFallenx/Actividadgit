public class SistemaSalsamentaria {
    public static void main(String[] args) {
        // se usa el polimorfismo para crear objetos de las clases hijas
        
        Producto salami = new Embutido("Salami Premium", 15500.0, "Cerdo y Res");
        Producto queso = new Lacteo("Queso Doble Crema", 8200.0, true);

        // Ejecución de métodos
        salami.mostrarDetalles();
        queso.mostrarDetalles();
    }
}