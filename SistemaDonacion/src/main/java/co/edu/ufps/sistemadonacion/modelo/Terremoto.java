/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadonacion.modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Terremoto {

    private LocalDate fecha;
    private LocalTime hora;
    private double profundidad;
    private double magnitud;
    private String epicentro;

    private List<Municipio> municipiosAfectados;

    public Terremoto() {
        municipiosAfectados = new ArrayList<>();
    }

    public Terremoto(LocalDate fecha, LocalTime hora,
            double profundidad, double magnitud,
            String epicentro) {

        this.fecha = fecha;
        this.hora = hora;
        this.profundidad = profundidad;
        this.magnitud = magnitud;
        this.epicentro = epicentro;

        this.municipiosAfectados = new ArrayList<>();
    }

    public void registrarUbicacion(String epicentro) {
        this.epicentro = epicentro;
    }

    public double obtenerMagnitud() {
        return magnitud;
    }

    public void agregarMunicipioAfectado(Municipio municipio) {
        municipiosAfectados.add(municipio);
    }

    public List<Municipio> consultarMunicipiosAfectados() {
        return municipiosAfectados;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public double getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(double magnitud) {
        this.magnitud = magnitud;
    }

    public String getEpicentro() {
        return epicentro;
    }

    public void setEpicentro(String epicentro) {
        this.epicentro = epicentro;
    }

}
