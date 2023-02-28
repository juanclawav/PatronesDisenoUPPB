package Memento;

import java.util.ArrayList;

class BDD {
    private ArrayList<Persona> personas;
    private ArrayList<Memento> mementos;
    private String nombreBackup;

    public BDD() {
        personas = new ArrayList<>();
        mementos = new ArrayList<>();
        nombreBackup = "BackupInicial";
    }

    public void addPersona(Persona p) {
        personas.add(p);
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public Memento guardar(String nombreBackup) {
        Memento m = new Memento(nombreBackup, personas);
        mementos.add(m);
        if (mementos.size() > 5) {
            mementos.remove(0);
        }
        return m;
    }

    public void restaurar(Memento m) {
        personas = m.getPersonas();
    }

    public void imprimirPersonas() {
        for (Persona p : personas) {
            System.out.println(p);
        }
    }

    public void setNombreBackup(String nombreBackup) {
        this.nombreBackup = nombreBackup;
    }

    public String getNombreBackup() {
        return nombreBackup;
    }
}
