/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;


public class Disciplina {

    private String nombre;
    private String normatividad;     
    private List<Evento> eventos;

    public Disciplina() {
        this.eventos = new ArrayList<>();
    }

    public Disciplina(String nombre, String normatividad) {
        this();
        this.nombre = nombre;
        this.normatividad = normatividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNormatividad() {
        return normatividad;
    }

    public void setNormatividad(String normatividad) {
        this.normatividad = normatividad;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    
    public void programarEvento(Evento evento) {
        this.eventos.add(evento);
        System.out.println("Se programó un nuevo evento en la disciplina " + nombre);
    }

    
    public void actualizarNormativas(String nuevaNormatividad) {
        this.normatividad = nuevaNormatividad;
        System.out.println("Reglamento de " + nombre + " actualizado");
    }
}
