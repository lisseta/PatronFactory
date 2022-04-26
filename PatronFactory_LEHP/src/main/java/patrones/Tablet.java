/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones;

import PatronFactory.Factory;


/**
 *
 * @author lisseta
 */
public class Tablet implements Factory {
    
    private String modelo;  
    private int ram;
    private float almacenamiento;
    private float pulgadas;
    private boolean stylus; 

    public Tablet() {
    }

    public Tablet(String modelo, int ram, float almacenamiento, float pulgadas, boolean stylus) {
        this.modelo = modelo;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.pulgadas = pulgadas;
        this.stylus = stylus;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public float getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(float almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isStylus() {
        return stylus;
    }

    public void setStylus(boolean stylus) {
        this.stylus = stylus;
    }

    @Override
    public String toString() {
        return "Tablet{" + "modelo=" + modelo + ", ram=" + ram + ", almacenamiento=" + almacenamiento + ", pulgadas=" + pulgadas + ", stylus=" + stylus + '}';
    }
    
    
}
