package org.ncasanovas.plantanuclear;

import org.ncasanovas.plantanuclear.interfaces.EmpleadoControl;
import org.ncasanovas.plantanuclear.models.Burns;
import org.ncasanovas.plantanuclear.models.Homero;


public class PlantaNuclear {

    private EmpleadoControl empleadoControl;
    private Integer cantidadDeUranio;
    private Burns duenio = new Burns();

    public EmpleadoControl getEmpleadoControl() {
        return this.empleadoControl;
    }

    public void setEmpleadoControl() {
        this.empleadoControl = new Homero();
    }

    public Burns getDuenio() {
        return duenio;
    }

    public void setDuenio() {
        this.duenio = new Burns();
    }

    public void agregarUranio(Integer cantidadDeUranio) {
        this.cantidadDeUranio = cantidadDeUranio;
    }


    public void estaEnPeligro(Integer cantidadDeUranio, Homero homero) {


        if((cantidadDeUranio > 10000 && empleadoControl instanceof Homero && empleadoControl.estaDistraido()) || duenio.estaPobre()) {
                System.out.println("La planta nuclear está en peligro!!");
        }

        if((cantidadDeUranio > 10000 && !homero.estaDistraido()) && !duenio.estaPobre()
        || (cantidadDeUranio < 10000 && homero.estaDistraido() && !duenio.estaPobre())
        || cantidadDeUranio > 10000 && homero.estaDistraido() && !duenio.estaPobre()) {
            System.out.println("La planta nuclear NO está en peligro!! El pato balancín cuida la planta");
        }

        if((cantidadDeUranio < 10000 && !homero.estaDistraido() && !duenio.estaPobre())) {
            System.out.println("La planta nuclear NO está en peligro");
        }


    }
}
