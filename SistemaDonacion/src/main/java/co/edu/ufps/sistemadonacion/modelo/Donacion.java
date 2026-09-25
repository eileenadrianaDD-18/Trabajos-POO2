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
public class Donacion {

    private LocalDate fecha;
    private double cantidad;
    private TipoDonacion tipoDonacion;
    private Organizacion organizacion;

    public Donacion() {
    }

    public Donacion(LocalDate fecha, double cantidad,
            TipoDonacion tipoDonacion) {

        this.fecha = fecha;
        this.cantidad = cantidad;
        this.tipoDonacion = tipoDonacion;
    }

    public void registrarDonacion() {
        System.out.println("Donación registrada correctamente.");
    }

    public boolean validarDonacion() {
        return cantidad > 0 && tipoDonacion != null;
    }

    public void asignarOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
        organizacion.recibirDonacion(this);
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

    public TipoDonacion getTipoDonacion() {
        return tipoDonacion;
    }

    public void setTipoDonacion(TipoDonacion tipoDonacion) {
        this.tipoDonacion = tipoDonacion;
    }

    public Organizacion getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }

}
