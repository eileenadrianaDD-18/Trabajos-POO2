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
public class Municipio {

    private String nombre;
    private List<Persona> personas;

    public Municipio() {
        personas = new ArrayList<>();
    }

    public Municipio(String nombre) {
        this.nombre = nombre;
        this.personas = new ArrayList<>();
    }

    public void registrarPersona(Persona persona) {
        personas.add(persona);
    }

    public List<Persona> consultarPersonas() {
        return personas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
