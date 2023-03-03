package Observer;

public class Main {
    public static void main(String[] args) {
        Telefonia telefonia = new Telefonia();

        Cliente pedro = new Cliente("Pedro");
        Cliente maria = new Cliente("Maria");
        Cliente eynar = new Cliente("Eynar");

        telefonia.subscribe("promociones", pedro);
        telefonia.subscribe("premios", pedro);
        telefonia.subscribe("noticias", maria);
        telefonia.subscribe("precios llamadas", eynar);
        telefonia.subscribe("promociones", eynar);
        telefonia.subscribe("premios", eynar);
        telefonia.subscribe("noticias", eynar);

        telefonia.sendNotification("promociones", "50% de descuento en planes ilimitados");
    }
}
