package Memento;

import java.util.ArrayList;

class Memento {
    private ArrayList<Persona> personas;
    private String backupName;

    public Memento(String backupName, ArrayList<Persona> personas) {
        this.backupName = backupName;
        this.personas = new ArrayList<>(personas);
    }
    public String getNombreBackup() {
        return backupName;
    }
    public ArrayList<Persona> getPersonas() {
        return personas;
    }
}



