package Composite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ComponenteComputadora comp1 = new Computadora();
        ComponenteComputadora comp2 = new Computadora();
        Laboratorio lab1 = new Laboratorio();
        lab1.agregar(comp1);
        lab1.agregar(comp2);
        Laboratorio lab2 = new Laboratorio();
        lab2.agregar(comp1);
        lab2.agregar(comp2);
        ContenedorDeComputadoras contenedor = new ContenedorDeComputadoras();
        contenedor.agregar(lab1);
        contenedor.agregar(lab2);
        System.out.println("Precio total del contenedor: $" + contenedor.getPrecio());
    }
}

