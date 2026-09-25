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
public class Pais {

    private String nombre;
    private List<Departamento> departamentos;
    private List<Terremoto> terremotos;

    public Pais() {
        departamentos = new ArrayList<>();
        terremotos = new ArrayList<>();
    }

    public Pais(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
        this.terremotos = new ArrayList<>();
    }

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public List<Departamento> consultarDepartamentos() {
        return departamentos;
    }

    public void agregarTerremoto(Terremoto terremoto) {
        terremotos.add(terremoto);
    }

    public List<Terremoto> consultarTerremotos() {
        return terremotos;
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
