package Mediator;

class SM implements Colega {
    private String name;
    private int ci;
    private String certificaciones;
    private ChatMediator mediator;

    public SM(String name, int ci, String certificaciones, ChatMediator mediator) {
        this.name = name;
        this.ci = ci;
        this.certificaciones = certificaciones;
        this.mediator = mediator;
    }

    @Override
    public void enviar(String mensaje) {
        mediator.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("SM " + name + " recibe el mensaje: " + mensaje);
    }

    public String getName() {
        return name;
    }

    public int getCi() {
        return ci;
    }

    public String getCertificaciones() {
        return certificaciones;
    }
}
