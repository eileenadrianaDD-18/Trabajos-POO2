/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;


public class Deporte {

    private String nombre;
    private String federacion;
    private List<Disciplina> disciplinas;

    public Deporte() {
        this.disciplinas = new ArrayList<>();
    }

    public Deporte(String nombre, String federacion) {
        this();
        this.nombre = nombre;
        this.federacion = federacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFederacion() {
        return federacion;
    }

    public void setFederacion(String federacion) {
        this.federacion = federacion;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    
    public void agregarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }
}
