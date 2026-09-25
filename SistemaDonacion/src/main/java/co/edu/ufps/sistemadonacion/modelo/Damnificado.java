/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadonacion.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Damnificado extends Persona {

    private NivelAfectacion nivelAfectacion;
    private List<Ayuda> ayudas;

    public Damnificado() {
        ayudas = new ArrayList<>();
    }

    public Damnificado(String nombre, int edad, double estatura,
            double peso, int identificacion, Estado estado,
            NivelAfectacion nivelAfectacion) {

        super(nombre, edad, estatura, peso, identificacion, estado);

        this.nivelAfectacion = nivelAfectacion;
        this.ayudas = new ArrayList<>();
    }

    public void registrarNivelAfectacion(NivelAfectacion nivel) {
        this.nivelAfectacion = nivel;
    }

    public void solicitarAyuda() {
        System.out.println("El damnificado " + getNombre()
                + " ha solicitado ayuda.");
    }

    public void recibirAyuda(Ayuda ayuda) {
        ayudas.add(ayuda);
    }

    public NivelAfectacion getNivelAfectacion() {
        return nivelAfectacion;
    }

    public void setNivelAfectacion(NivelAfectacion nivelAfectacion) {
        this.nivelAfectacion = nivelAfectacion;
    }

    public List<Ayuda> getAyudas() {
        return ayudas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
