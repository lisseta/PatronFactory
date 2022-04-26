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
public class Smartphone implements Factory {
    
    private String procesador;
    private int ram;  
    private int almacenamiento;
    private String pantalla; //TFT, LED, IPS, Retina y Super PLS.
    private String SO; //Android, Mac 
    private int camaras; 

    public Smartphone() {
    }

    public Smartphone(String procesador, int ram, int almacenamiento, String pantalla, String SO, int camaras) {
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.pantalla = pantalla;
        this.SO = SO;
        this.camaras = camaras;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public int getCamaras() {
        return camaras;
    }

    public void setCamaras(int camaras) {
        this.camaras = camaras;
    }

    @Override
    public String toString() {
        return "Smartphone"
                + "{" + "procesador=" + procesador 
                + ", ram=" + ram + ", almacenamiento=" + almacenamiento 
                + ", pantalla=" + pantalla + ", SO=" + SO + ", camaras=" + camaras + '}';
    }
    
   
         
    
    
}
