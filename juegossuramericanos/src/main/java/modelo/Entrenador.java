/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;


public class Entrenador extends Miembro {

    private NivelCertificacion nivelCertificacion; 
    private String estrategia; 

    public Entrenador() {
    
    }

    public Entrenador(String nombre, Date fechaNacimiento, String pasaporte,
            NivelCertificacion nivelCertificacion, String estrategia) {
        super(nombre, fechaNacimiento, pasaporte);
        this.nivelCertificacion = nivelCertificacion;
        this.estrategia = estrategia;
    }

    public NivelCertificacion getNivelCertificacion() {
        return nivelCertificacion;
    }

    public void setNivelCertificacion(NivelCertificacion nivelCertificacion) {
        this.nivelCertificacion = nivelCertificacion;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

 
    public void planificarEstrategias() {
        System.out.println(getNombre() + " (nivel " + nivelCertificacion  + ") planifica la estrategia: " + estrategia);
    }

    @Override
    public String toString() {
        return getNombre();
    }
}
