/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;



public class Organizador {

    private String nombre;
    private List<Edicion> ediciones;

    public Organizador(String nombre) {
        this.nombre = nombre;
        this.ediciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Edicion> getEdiciones() {
        return ediciones;
    }

    public void agregarEdicion(Edicion edicion) {
        this.ediciones.add(edicion);
    }

    // Métodos operacionales

    public void inaugurarJuegos(Edicion edicion) {
        if (!ediciones.contains(edicion)) {
            agregarEdicion(edicion);
        }
        edicion.abrir();
    }

    public void clausurarJuegos(Edicion edicion) {
        edicion.cerrar();
    }
}
