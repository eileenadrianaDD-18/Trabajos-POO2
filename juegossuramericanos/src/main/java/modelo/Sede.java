/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;


public class Sede {

    private String nombre;
    private int capacidadEspectadores;
    private String direccion;
     private List<Evento> eventos;

    public Sede() {
        this.eventos = new ArrayList<>();
    }

    public Sede(String nombre, int capacidadEspectadores, String direccion) {
        this();
        this.nombre = nombre;
        this.capacidadEspectadores = capacidadEspectadores;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadEspectadores() {
        return capacidadEspectadores;
    }

    public void setCapacidadEspectadores(int capacidadEspectadores) {
        this.capacidadEspectadores = capacidadEspectadores;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    public void asignarSede(Evento evento) {
        evento.setSedeDeportiva(this);
        this.eventos.add(evento);
        System.out.println("Sede " + nombre + " asignada para el evento");
    }

   
    public boolean verificarCapacidad(int cantidadEspectadores) {
        
        boolean disponible = cantidadEspectadores <= capacidadEspectadores;
        if (!disponible) {
            System.out.println("Capacidad excedida en " + nombre);
        }
        
        return disponible;
        
    }
}
