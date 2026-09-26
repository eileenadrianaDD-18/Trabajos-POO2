/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;


public class Clasificacion {

    private String marca;
    private Date fecha;
    private EstadoAprobacion estado;

    public Clasificacion() {
        this.estado = EstadoAprobacion.PENDIENTE;
    }

    public Clasificacion(String marca, Date fecha) {
        this.marca = marca;
        this.fecha = fecha;
        this.estado = EstadoAprobacion.PENDIENTE;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public EstadoAprobacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoAprobacion estado) {
        this.estado = estado;
    }

   
    public boolean validarRequisitos() {
        
        if (marca != null) {
            this.estado = EstadoAprobacion.APROBADO;
        } 
        
        else {
            this.estado = EstadoAprobacion.RECHAZADO;
        }
        
        return this.estado == EstadoAprobacion.APROBADO;
        
    }
}
