package Memento;

class Persona {
    private String name;
    private int ci;
    private int edad;

    public Persona(String name, int ci, int edad) {
        this.name = name;
        this.ci = ci;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public int getCi() {
        return ci;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", ci=" + ci +
                ", edad=" + edad +
                '}';
    }
}
