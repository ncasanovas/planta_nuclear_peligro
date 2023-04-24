package org.ncasanovas.plantanuclear.models;

import org.ncasanovas.plantanuclear.interfaces.EmpleadoControl;

public class Homero implements EmpleadoControl {

    private Integer donas;


    public void setDonas(Integer donas) {
        this.donas = donas;
    }

    public Integer getDonas() {
        return this.donas;
    }

    @Override
    public boolean estaDistraido() {
        return this.getDonas() > 0;
    }

    public void comprarDonas(Integer donas){
        this.setDonas(donas);
        System.out.println("Homero compró " + donas + " donas");
    }

    public void comerDona() {
        System.out.println("Homero comió " + donas + " donas");
    }


}
