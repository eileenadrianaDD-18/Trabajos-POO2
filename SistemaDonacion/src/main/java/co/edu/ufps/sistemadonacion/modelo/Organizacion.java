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
public class Organizacion {

    private String nombre;
    private String representante;
    private TipoOrganizacion tipoOrganizacion;

    private List<Donacion> donaciones;
    private List<Ayuda> ayudas;

    public Organizacion() {
        donaciones = new ArrayList<>();
        ayudas = new ArrayList<>();
    }

    public Organizacion(String nombre, String representante,
            TipoOrganizacion tipoOrganizacion) {

        this.nombre = nombre;
        this.representante = representante;
        this.tipoOrganizacion = tipoOrganizacion;

        this.donaciones = new ArrayList<>();
        this.ayudas = new ArrayList<>();
    }

    public void gestionarDonacion(Donacion donacion) {
        if (donacion != null && donacion.validarDonacion()) {
            donaciones.add(donacion);
        }
    }

    public void recibirDonacion(Donacion donacion) {
        if (donacion != null) {
            donaciones.add(donacion);
        }
    }

    public Ayuda generarAyuda(TipoAyuda tipo, double cantidad) {

        Ayuda ayuda = new Ayuda(tipo, cantidad);
        ayudas.add(ayuda);

        return ayuda;
    }

    public void entregarAyuda(Ayuda ayuda, Damnificado damnificado) {

        if (ayuda != null && damnificado != null) {

            ayudas.add(ayuda);
            ayuda.asignarDamnificado(damnificado);
            damnificado.recibirAyuda(ayuda);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public TipoOrganizacion getTipoOrganizacion() {
        return tipoOrganizacion;
    }

    public void setTipoOrganizacion(TipoOrganizacion tipoOrganizacion) {
        this.tipoOrganizacion = tipoOrganizacion;
    }

    public List<Donacion> getDonaciones() {
        return donaciones;
    }

    public List<Ayuda> getAyudas() {
        return ayudas;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
