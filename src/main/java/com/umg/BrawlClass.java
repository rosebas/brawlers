/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg;

/**
 *
 * @author Edgar Montejo
 */
public class BrawlClass {
    String nombre;
    int nivelFuerza;
    int danioUlti;
    int danioBasico;
    int velocidad;
    int rangoDanio;

    public BrawlClass(String nombre, int nivelFuerza, int danioUlti, int danioBasico, int velocidad, int rangoDanio) {
        this.nombre = nombre;
        this.nivelFuerza = nivelFuerza;
        this.danioUlti = danioUlti;
        this.danioBasico = danioBasico;
        this.velocidad = velocidad;
        this.rangoDanio = rangoDanio;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelFuerza() {
        return nivelFuerza;
    }

    public void setNivelFuerza(int nivelFuerza) {
        this.nivelFuerza = nivelFuerza;
    }

    public int getDanioUlti() {
        return danioUlti;
    }

    public void setDanioUlti(int danioUlti) {
        this.danioUlti = danioUlti;
    }

    public int getDanioBasico() {
        return danioBasico;
    }

    public void setDanioBasico(int danioBasico) {
        this.danioBasico = danioBasico;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getRangoDanio() {
        return rangoDanio;
    }

    public void setRangoDanio(int rangoDanio) {
        this.rangoDanio = rangoDanio;
    }
    
    
}
