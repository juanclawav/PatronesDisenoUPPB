package Mediator;

class QA implements Colega {
    private String name;
    private int ci;
    private String grado;
    private ChatMediator mediator;

    public QA(String name, int ci, String grado, ChatMediator mediator) {
        this.name = name;
        this.ci = ci;
        this.grado = grado;
        this.mediator = mediator;
    }

    @Override
    public void enviar(String mensaje) {
        mediator.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("QA " + name + " recibe el mensaje: " + mensaje);
    }

    public String getName() {
        return name;
    }

    public int getCi() {
        return ci;
    }

    public String getGrado() {
        return grado;
    }
}