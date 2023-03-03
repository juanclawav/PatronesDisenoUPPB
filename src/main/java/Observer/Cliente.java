package Observer;

class Cliente implements IObserver {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String notificationType, String message) {
        System.out.println(nombre + " recibió la notificación: " + notificationType + " - " + message);
    }
}