public class TelefonoInteligente implements Conectable, Recargable {

    @Override
    public void conectar() {
        System.out.println("Teléfono conectado a la red WiFi.");
    }

    @Override
    public void desconectar() {
        System.out.println("Teléfono desconectado de la red.");
    }

    @Override
    public void cargarBateria() {
        System.out.println("Batería del teléfono cargando al 100%.");
    }

    public static void main(String[] args) {
        TelefonoInteligente telefono = new TelefonoInteligente();

        System.out.println("--- Uso bajo referencia Conectable ---");
        Conectable c = telefono;
        c.conectar();
        c.desconectar();
        // c.cargarBateria(); // No visible desde la interfaz Conectable

        System.out.println("\n--- Uso bajo referencia Recargable ---");
        Recargable r = telefono;
        r.cargarBateria();
        // r.conectar(); // No visible desde la interfaz Recargable
    }
}