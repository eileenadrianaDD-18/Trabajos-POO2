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
public class Departamento {

    private String nombre;
    private List<Municipio> municipios;

    public Departamento() {
        municipios = new ArrayList<>();
    }

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.municipios = new ArrayList<>();
    }

    public void agregarMunicipio(Municipio municipio) {
        municipios.add(municipio);
    }

    public List<Municipio> consultarMunicipios() {
        return municipios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
