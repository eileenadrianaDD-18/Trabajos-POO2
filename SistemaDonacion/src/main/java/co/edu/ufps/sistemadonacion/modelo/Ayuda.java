/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadonacion.modelo;

import java.time.LocalDate;

/**
 *
 * @author DELL
 */
public class Ayuda {

    private LocalDate fecha;
    private double cantidad;
    private TipoAyuda tipoAyuda;
    private Damnificado damnificado;

    public Ayuda() {
    }

    public Ayuda(TipoAyuda tipoAyuda, double cantidad) {
        this.fecha = LocalDate.now();
        this.cantidad = cantidad;
        this.tipoAyuda = tipoAyuda;
    }

    public Ayuda(LocalDate fecha, double cantidad,
            TipoAyuda tipoAyuda) {

        this.fecha = fecha;
        this.cantidad = cantidad;
        this.tipoAyuda = tipoAyuda;
    }

    public void asignarDamnificado(Damnificado damnificado) {
        this.damnificado = damnificado;
    }

    public void entregar() {
        System.out.println("Ayuda entregada correctamente.");
    }

    public TipoAyuda consultarTipo() {
        return tipoAyuda;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public TipoAyuda getTipoAyuda() {
        return tipoAyuda;
    }

    public void setTipoAyuda(TipoAyuda tipoAyuda) {
        this.tipoAyuda = tipoAyuda;
    }

    public Damnificado getDamnificado() {
        return damnificado;
    }

}
