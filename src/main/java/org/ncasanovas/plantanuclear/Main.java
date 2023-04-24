package org.ncasanovas.plantanuclear;

import org.ncasanovas.plantanuclear.interfaces.EmpleadoControl;
import org.ncasanovas.plantanuclear.models.Burns;
import org.ncasanovas.plantanuclear.models.Homero;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        PlantaNuclear plantaNuclear = new PlantaNuclear();

        System.out.println("---------- Bienvenido a la Planta Nuclear -------------");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de barras de uranio que hay en el depósito");
        Integer cantidadUranio = sc.nextInt();
        plantaNuclear.agregarUranio(cantidadUranio);

        System.out.println("¿El empleado de la sala de control está distraído? Ingrese la cantidad de donas que está comprando:");
        Integer cantDonas = sc.nextInt();
        sc.nextLine();

        Homero homero = new Homero();
        homero.setDonas(cantDonas);
        homero.comprarDonas(cantDonas);
        homero.comerDona();

        Burns duenio = new Burns();

        System.out.println("Burns está pobre?: " + duenio.estaPobre());

        plantaNuclear.estaEnPeligro(cantidadUranio, homero);



    }
}