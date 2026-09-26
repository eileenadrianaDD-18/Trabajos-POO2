/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;


public class Edicion {

    private int anioRealizacion;
    private String ciudad;
    private String sede;
    private String lema;
    private boolean inaugurada;
    private ArrayList<ComiteOlimpico> comitesParticipantes;

    public Edicion() {
        this.comitesParticipantes = new ArrayList<>();
    }

    public Edicion(int anioRealizacion, String ciudad, String sede, String lema) {
     
        this.anioRealizacion = anioRealizacion;
        this.ciudad = ciudad;
        this.sede = sede;
        this.lema = lema;
        this.comitesParticipantes = new ArrayList<>();
        
    }

    public int getAnioRealizacion() {
        return anioRealizacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getSede() {
        return sede;
    }

    public String getLema() {
        return lema;
    }

    public boolean isInaugurada() {
        return inaugurada;
    }

    public List<ComiteOlimpico> getComitesParticipantes() {
        return comitesParticipantes;
    }

    public void agregarComite(ComiteOlimpico comite) {
        this.comitesParticipantes.add(comite);
    }

    
    public void abrir() {
        this.inaugurada = true;
        System.out.println("Edicion: " + anioRealizacion + " (" + ciudad + ") se ha inaugurado con el lema: " + lema);
    }

   
    public void cerrar() {
        this.inaugurada = false;
        System.out.println("Edicion: " + anioRealizacion + " (" + ciudad + ") ha sido finalizada");
    }
}
