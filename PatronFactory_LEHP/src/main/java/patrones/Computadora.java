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
public class Computadora implements Factory { // Se implementa Factory
    
    private String marca;
    private String procesador; //Arreglar e identificar de donde salen los PRIVATE 
    private String SO;
    private int ram;
    private boolean ssd; 
    private float almacenamiento;   

    public Computadora() { //Constructor ctrl+espacio+ enter 2 veces 
    }

    public Computadora(String marca, String procesador, String SO, int ram, boolean ssd, float almacenamiento) {
        this.marca = marca;
        this.procesador = procesador;
        this.SO = SO;
        this.ram = ram;
        this.ssd = ssd;
        this.almacenamiento = almacenamiento;
    }
    
    //Metrodos de Acceso Click derecho,Insert Code-Getters and Setters 
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isSsd() {
        return ssd;
    }

    public void setSsd(boolean ssd) {
        this.ssd = ssd;
    }

    public float getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(float almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", procesador=" + procesador 
                + ", SO=" + SO + ", ram=" + ram + ", ssd=" + ssd 
                + ", almacenamiento=" + almacenamiento + '}';
    }
           
}

