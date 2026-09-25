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
public class Empresa {

    private String nombre;
    private String representante;

    private List<Donacion> donaciones;

    public Empresa() {
        donaciones = new ArrayList<>();
    }

    public Empresa(String nombre, String representante) {
        this.nombre = nombre;
        this.representante = representante;
        this.donaciones = new ArrayList<>();
    }

    public void realizarDonacion(Donacion donacion) {
        donaciones.add(donacion);
    }

    public List<Donacion> consultarDonaciones() {
        return donaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
