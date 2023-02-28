package Mediator;

import java.util.HashMap;
import java.util.Map;

class SkypeChat implements ChatMediator {
    private Map<String, Colega> mapaColegas;

    public SkypeChat() {
        mapaColegas = new HashMap<>();
    }

    @Override
    public void enviarMensaje(String mensaje, Colega colega) {
        String key = "";
        if (colega instanceof QA) {
            key = "QA";
        } else if (colega instanceof DEV) {
            key = "DEV";
        } else if (colega instanceof SM) {
            key = "SM";
        }

        // Enviar el mensaje a todos los miembros del grupo
        for (Map.Entry<String, Colega> entry : mapaColegas.entrySet()) {
            if(!entry.getValue().equals(colega)) {
                if (key.equals("SM")) {
                    entry.getValue().recibir(mensaje);
                } else if (entry.getKey().equals(key)) {
                    entry.getValue().recibir(mensaje);
                }
            }
        }
    }

    public void addColega(String key, Colega colega) {
        mapaColegas.put(key, colega);
    }
}

