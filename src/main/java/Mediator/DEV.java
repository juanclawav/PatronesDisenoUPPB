package Mediator;

class DEV implements Colega {
    private String name;
    private int ci;
    private String lenguaje;
    private ChatMediator mediator;

    public DEV(String name, int ci, String lenguaje, ChatMediator mediator) {
        this.name = name;
        this.ci = ci;
        this.lenguaje = lenguaje;
        this.mediator = mediator;
    }

    @Override
    public void enviar(String mensaje) {
        mediator.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("DEV " + name + " recibe el mensaje: " + mensaje);
    }

    public String getName() {
        return name;
    }

    public int getCi() {
        return ci;
    }

    public String getLenguaje() {
        return lenguaje;
    }
}
